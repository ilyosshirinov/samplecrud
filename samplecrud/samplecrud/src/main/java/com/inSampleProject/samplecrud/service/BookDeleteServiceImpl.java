package com.inSampleProject.samplecrud.service;

import com.inSampleProject.samplecrud.dto.Requestdto;
import com.inSampleProject.samplecrud.repository.BookDeleteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookDeleteServiceImpl implements BookDeleteService {
    @Autowired
    BookDeleteRepo bookDeleteRepo;
    @Override
    public String deleteBook(Requestdto path) {
        return bookDeleteRepo.deleteBook(path);
    }
}
