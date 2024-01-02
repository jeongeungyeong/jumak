package com.example.jumak.controller.admin.aproduct;


import com.example.jumak.domain.dto.product.ProductImgMainDto;
import com.example.jumak.service.admin.aproduct.AProductImgMainService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/productImgMain")
public class AProductImgMainController {
    private final AProductImgMainService aProductImgMainService;

    @Value("${file.dir}")
    private String fileDir;

    @GetMapping("/img")
    public ProductImgMainDto img(@RequestParam("productNumber") Long productNumber){
        return aProductImgMainService.findOne(productNumber);
    }

    @GetMapping("/display")
    public byte[] display(@RequestParam("fileFullName") String fileFullName) throws IOException {
        System.out.println("fileFullName = " + fileFullName);
        return FileCopyUtils.copyToByteArray(new File(fileDir, fileFullName));
    }

}
