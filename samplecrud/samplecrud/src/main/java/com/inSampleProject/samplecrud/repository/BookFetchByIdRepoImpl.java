package com.inSampleProject.samplecrud.repository;

import com.inSampleProject.samplecrud.dto.Bookdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BookFetchByIdRepoImpl implements BookFetchByIdRepo {
    @Autowired
    public JdbcTemplate jdbcTemplate;
    @Override
    public List<Bookdto> fetchingSelectedBook(int id) {
        String sql="select * from booknew t where t.id in("+id+")";
        return jdbcTemplate.query(sql,(rs,rownum)->
                new Bookdto(rs.getLong(1),
                            rs.getString(2),
                            rs.getString(3)));
    }
}
