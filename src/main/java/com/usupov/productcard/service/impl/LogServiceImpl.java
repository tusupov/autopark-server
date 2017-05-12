package com.usupov.productcard.service.impl;

import com.usupov.productcard.service.LogService;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service("LogService")
public class LogServiceImpl implements LogService {

    private static final String LINE_SEPARATOR = "\r\n";

    @Override
    public void add(String filePrefix, String log) {

        try {

            (new File(Paths.get("logs").toString())).mkdirs();

            File file = new File(Paths.get("logs").resolve(filePrefix + ".log").toString());

            PrintWriter pw = new PrintWriter(new OutputStreamWriter(
                    new FileOutputStream(file, true),"UTF-8"));

            String timeStamp = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(new Date());

            pw.append("[" + timeStamp + "] " + log + LINE_SEPARATOR);
            pw.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}
