package com.inSampleProject.samplecrud.repository;

import com.inSampleProject.samplecrud.dto.Bookdto;
import com.inSampleProject.samplecrud.dto.Requestdto;

import java.util.List;

public interface BookNameInsertRepo {
    String insertNameBook(Requestdto path);
}
