package com.samuelperez.soccerfieldmanager.services;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CloudinaryService {
    @Autowired
    private Cloudinary cloudinary;

    public Map<String, object> uploadImg(MultipartFile file, String folder) throws IOException{
        String originalFilename = file.getOriginalFilename();

        if(originalFilename == null){
            throw new IllegalArgumentException("");
          
         
        }
    
        String newName = originalFilename.substring(0, originalFilename.lastIndexOf('.'));
    
        String timetamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

        String fileName = newName + "_" + timetamp;

        @SuppressWarnings({"uncheket"})
        Map<String, object> uploadResut = (Map<String, object>)cloudinary.uploader(file.getBytes(),
        objectUtils.asMap(
            "folder", folder,
            "public", fileName
        ));
    }
}
