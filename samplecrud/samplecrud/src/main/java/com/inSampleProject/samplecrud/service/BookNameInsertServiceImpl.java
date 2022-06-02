package com.inSampleProject.samplecrud.service;

import com.inSampleProject.samplecrud.dto.Bookdto;
import com.inSampleProject.samplecrud.dto.Requestdto;
import com.inSampleProject.samplecrud.repository.BookNameInsertRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookNameInsertServiceImpl implements BookNameInsertService {
    @Autowired
    BookNameInsertRepo bookNameInsertRepo;
    @Override
    public String insertBook(Requestdto path) {
        return bookNameInsertRepo.insertNameBook(path);
    }
}
