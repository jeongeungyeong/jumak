package com.example.jumak.service.admin.aproduct;

import com.example.jumak.domain.dto.product.ProductImgMainDto;
import com.example.jumak.mapper.admin.aproduct.AProductImgMainMapper;
import lombok.RequiredArgsConstructor;
import net.coobird.thumbnailator.Thumbnailator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class AProductImgMainService {
    private final AProductImgMainMapper aProductImgMainMapper;

    @Value("${file.dir}")
    private String fileDir;

    public void register(ProductImgMainDto productImgMainDto){
        aProductImgMainMapper.insert(productImgMainDto);
    }

    public ProductImgMainDto findOne(Long productNumber){
        return aProductImgMainMapper.selectOne(productNumber);
    }

    private String getUploadPath(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return sdf.format(new Date());
    }
    public ProductImgMainDto saveFile(MultipartFile file) throws IOException{
        String originName = file.getOriginalFilename();
        UUID uuid = UUID.randomUUID();

        String sysName = uuid.toString() + "_" + originName;

        File uploadPath = new File(fileDir, getUploadPath());

        if(!uploadPath.exists()){
            uploadPath.mkdirs();
        }

        File uploadFile = new File(uploadPath, sysName);

        file.transferTo(uploadFile);

        if(Files.probeContentType(uploadFile.toPath()).startsWith("image")){
            FileOutputStream out = new FileOutputStream(new File(uploadPath, "th_" + sysName));
            Thumbnailator.createThumbnail(file.getInputStream(), out, 300, 200);
            out.close();
        }

        ProductImgMainDto productImgMainDto = new ProductImgMainDto();
        productImgMainDto.setProductImgMainName(originName);
        productImgMainDto.setProductImgMainUuid(uuid.toString());
        productImgMainDto.setProductImgMainPath(getUploadPath());

        return productImgMainDto;
    }

    public void registerAndSaveFiles(List<MultipartFile> files, Long productNumber) throws IOException{
        for(MultipartFile file : files){
            if(file.isEmpty()) { return; }

            ProductImgMainDto productImgMainDto = saveFile(file);
            productImgMainDto.setProductNumber(productNumber);
            register(productImgMainDto);
        }
    }
}
