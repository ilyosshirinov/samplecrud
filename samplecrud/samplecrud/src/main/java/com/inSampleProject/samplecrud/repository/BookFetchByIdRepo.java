package com.inSampleProject.samplecrud.repository;

import com.inSampleProject.samplecrud.dto.Bookdto;

import java.util.List;

public interface BookFetchByIdRepo {
    List<Bookdto> fetchingSelectedBook(int id);
}
