package com.inSampleProject.samplecrud.repository;

import com.inSampleProject.samplecrud.dto.Bookdto;
import com.inSampleProject.samplecrud.dto.Requestdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookNameInsertRepoImpl implements BookNameInsertRepo {
    @Autowired
    public JdbcTemplate jdbcTemplate;
    private static String INSERT_QUERY = "INSERT INTO booknew(id, name, author) VALUES (?, ?, ?);";
    @Override
    public String insertNameBook(Requestdto path) {
        int status=jdbcTemplate.update(INSERT_QUERY,path.getId(),path.getName(),path.getAuthor());
       if(status==1) return "Record successfully added...";
        return "Failed to insert...";
    }
}
