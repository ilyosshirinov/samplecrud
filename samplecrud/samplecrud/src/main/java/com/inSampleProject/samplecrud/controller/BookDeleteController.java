package com.inSampleProject.samplecrud.controller;

import com.inSampleProject.samplecrud.dto.Requestdto;
import com.inSampleProject.samplecrud.service.BookDeleteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class BookDeleteController {
   Logger logger= LoggerFactory.getLogger(BookDeleteController.class);
    @Autowired
    BookDeleteService bookDeleteService;
    @RequestMapping(value = "/bookDelete", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)

    public String Delete(@RequestBody Requestdto path){
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss.SSS";
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        String formattedDate = dateFormat.format(date);
        logger.info(formattedDate + " BookDelete worked!");
        return bookDeleteService.deleteBook(path);
    }
}
