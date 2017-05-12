package com.usupov.productcard.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService  {

    String saveCarImage(MultipartFile file, long id) throws IOException;

    String getCarImageUrl(long id);

    String savePart(MultipartFile file, long id, long cnt);

}
