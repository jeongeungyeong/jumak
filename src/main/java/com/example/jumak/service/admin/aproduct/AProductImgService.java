package com.example.jumak.service.admin.aproduct;

import com.example.jumak.domain.dto.product.ProductImgDto;
import com.example.jumak.domain.dto.product.ProductImgMainDto;
import com.example.jumak.mapper.admin.aproduct.AProductImgMainMapper;
import com.example.jumak.mapper.admin.aproduct.AProductImgMapper;
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
public class AProductImgService {
    private final AProductImgMapper aProductImgMapper;

    @Value("${file.dir}")
    private String fileDir;

    public void register(ProductImgDto productImgDto){
        aProductImgMapper.insert(productImgDto);
    }

    public ProductImgDto findOne(Long productNumber){
        return aProductImgMapper.selectOne(productNumber);
    }

    private String getUploadPath(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return sdf.format(new Date());
    }
    public ProductImgDto saveFile(MultipartFile file) throws IOException{
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

        ProductImgDto productImgDto = new ProductImgDto();
        productImgDto.setProductImgName(originName);
        productImgDto.setProductImgUuid(uuid.toString());
        productImgDto.setProductImgPath(getUploadPath());

        return productImgDto;
    }

    public void registerAndSaveFiles(List<MultipartFile> files, Long productNumber) throws IOException{
        for(MultipartFile file : files){
            if(file.isEmpty()) { return; }

            ProductImgDto productImgDto = saveFile(file);
            productImgDto.setProductNumber(productNumber);
            register(productImgDto);
        }
    }
}
