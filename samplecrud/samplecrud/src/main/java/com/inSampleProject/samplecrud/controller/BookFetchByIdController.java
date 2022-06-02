package com.inSampleProject.samplecrud.controller;

import com.inSampleProject.samplecrud.dto.Bookdto;
import com.inSampleProject.samplecrud.dto.Requestdto;
import com.inSampleProject.samplecrud.service.BookFetchByIdService;
import com.inSampleProject.samplecrud.service.BookNameInsertService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class BookFetchByIdController {
    Logger logger = LoggerFactory.getLogger(BookFetchByIdController.class);
    @Autowired
    BookFetchByIdService bookFetchByIdService;

    @RequestMapping(value = "/bookfetch", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity<List<Bookdto>> List(@RequestBody Requestdto path) {
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss.SSS";
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        String formattedDate = dateFormat.format(date);
        logger.info(formattedDate + " BookFetchById worked!");
        return ResponseEntity.ok(bookFetchByIdService.fetchBook(path.getId()));

    }
}
