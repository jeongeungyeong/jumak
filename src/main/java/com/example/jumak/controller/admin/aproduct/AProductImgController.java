package com.example.jumak.controller.admin.aproduct;


import com.example.jumak.domain.dto.product.ProductImgDto;
import com.example.jumak.domain.dto.product.ProductImgMainDto;
import com.example.jumak.service.admin.aproduct.AProductImgMainService;
import com.example.jumak.service.admin.aproduct.AProductImgService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/productImg")
public class AProductImgController {
    private final AProductImgService aProductImgService;

    @Value("${file.dir}")
    private String fileDir;

    @GetMapping("/img")
    public ProductImgDto img(@RequestParam("productNumber") Long productNumber){
        return aProductImgService.findOne(productNumber);
    }

    @GetMapping("/display")
    public byte[] display(@RequestParam("fileFullName") String fileFullName) throws IOException {
        System.out.println("fileFullName = " + fileFullName);
        return FileCopyUtils.copyToByteArray(new File(fileDir, fileFullName));
    }

}
