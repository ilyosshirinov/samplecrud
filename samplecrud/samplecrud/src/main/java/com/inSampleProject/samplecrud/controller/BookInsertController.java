package com.inSampleProject.samplecrud.controller;

import com.inSampleProject.samplecrud.dto.Requestdto;
import com.inSampleProject.samplecrud.service.BookNameInsertService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class BookInsertController {
    Logger logger = LoggerFactory.getLogger(BookInsertController.class);
    @Autowired
    BookNameInsertService bookNameInsertService;

       public String Insert(@RequestBody Requestdto path) {
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss.SSS";
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        String formattedDate = dateFormat.format(date);
        logger.info(formattedDate + " BookInsert worked!");
        return bookNameInsertService.insertBook(path);
    }
}
