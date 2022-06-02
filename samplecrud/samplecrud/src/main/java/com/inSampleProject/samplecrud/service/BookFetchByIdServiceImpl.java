package com.inSampleProject.samplecrud.service;

import com.inSampleProject.samplecrud.dto.Bookdto;
import com.inSampleProject.samplecrud.repository.BookFetchByIdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookFetchByIdServiceImpl implements BookFetchByIdService {
    @Autowired
    BookFetchByIdRepo bookFetchByIdRepo;

    @Override
    public List<Bookdto> fetchBook(int id) {
        return bookFetchByIdRepo.fetchingSelectedBook(id);
    }
}
