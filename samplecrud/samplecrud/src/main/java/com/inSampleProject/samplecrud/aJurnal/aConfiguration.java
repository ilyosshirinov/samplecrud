package com.inSampleProject.samplecrud.aJurnal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@org.springframework.context.annotation.Configuration
public class aConfiguration {
  @Autowired
  private Environment environment;
    private DataSource dataSource1(){
        DriverManagerDataSource driverManager1 = new DriverManagerDataSource();
        driverManager1.setUrl("jdbc:postgresql://localhost:5433/Jurnal");
        driverManager1.setUsername("postgres");
        driverManager1.setPassword("postgres");
        driverManager1.setDriverClassName("org.postgresql.Driver");
        return driverManager1;
    }
    @Bean(name = "own")
    public JdbcTemplate own(){
        return new JdbcTemplate(dataSource1());
    }
}
