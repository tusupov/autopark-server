package com.usupov.autopark.service;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContextListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service("FileService")
public class FileServiceImpl implements FileService {

    @Override
    public String save(MultipartFile file, long id) {

        try {

            if (file != null && !file.isEmpty()) {

                //remote file if exits
                Files.deleteIfExists(
                    Paths.get("upload", "car").resolve(id + ".jpg")
                );

                (new File(Paths.get("upload", "car").toString())).mkdirs();

                //upload file to server
                Files.copy(
                    file.getInputStream(),
                    Paths.get("upload", "car").resolve(id + ".jpg")
                );

                return "http://88.99.174.4:8080/api/image/car/" + id;

            }

        } catch (Exception e) {}

        return null;

    }
}
