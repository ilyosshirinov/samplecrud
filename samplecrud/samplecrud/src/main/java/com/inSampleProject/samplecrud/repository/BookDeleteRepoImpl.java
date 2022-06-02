package com.inSampleProject.samplecrud.repository;

import com.inSampleProject.samplecrud.dto.Requestdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDeleteRepoImpl implements BookDeleteRepo {
    @Autowired
    public JdbcTemplate jdbcTemplate;
    private static String DELETE_QUERY = "DELETE FROM booknew WHERE id=?";

    @Override
    public String deleteBook(Requestdto path) {
        int status = jdbcTemplate.update(DELETE_QUERY, path.getId());
       if (status==1) return "O'chirildi...";
        return "Malumod topilmadi...";
    }
}
