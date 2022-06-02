package com.inSampleProject.samplecrud.repository;

import com.inSampleProject.samplecrud.dto.Requestdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookUpdateRepoImpl implements BookUpdateRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;
    private static String UPDATE_QUERY = "UPDATE booknew SET name=?, author=?  WHERE id=?";

    @Override
    public String updateBook(Requestdto path) {

        int status = jdbcTemplate.update(UPDATE_QUERY, path.getName(), path.getAuthor(), path.getId());
        if (status==1) return "O'zgartirildi...";
        return "O'zgartirilmadi...";
    }
}
