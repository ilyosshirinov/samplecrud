package com.inSampleProject.samplecrud.service;

import com.inSampleProject.samplecrud.dto.Bookdto;

import java.util.List;

public interface BookFetchByIdService {
    List<Bookdto> fetchBook(int id);
}
