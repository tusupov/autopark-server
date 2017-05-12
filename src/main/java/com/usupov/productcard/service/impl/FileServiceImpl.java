package com.usupov.productcard.service.impl;

import com.usupov.productcard.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service("FileService")
public class FileServiceImpl implements FileService {

    @Override
    public String saveCarImage(MultipartFile file, long id) {

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

                //return "http://88.99.174.4:8080/api/image/car/" + id;
                return "http://192.168.1.4:8080/api/image/car/" + id;

            }

        } catch (Exception e) {}

        return null;

    }

    @Override
    public String getCarImageUrl(long id) {

        try {

            if (Paths.get("upload", "car").resolve(id + ".jpg").toFile().exists())
                //return "http://88.99.174.4:8080/api/image/car/" + id;
                return "http://192.168.1.4:8080/api/image/car/" + id;

        } catch (Exception e) {}

        return null;

    }

    @Override
    public String savePart(MultipartFile file, long id, long cnt) {

//        try {
//
//            if (file != null && !file.isEmpty()) {
//
//                //remote file if exits
//                Files.deleteIfExists(
//                    Paths.get("upload", "part").resolve(id + "-" + cnt + ".jpg")
//                );
//
//                (new File(Paths.get("upload", "part").toString())).mkdirs();
//
//                //upload file to server
//                Files.copy(
//                    file.getInputStream(),
//                    Paths.get("upload", "part").resolve(id + "-" + cnt + ".jpg")
//                );
//
//                return "http://88.99.174.4:8080/api/image/part/" + id + "-" + cnt;
//
//            }
//
//        } catch (Exception e) {}

        return null;

    }


}
