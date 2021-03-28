package com.example.authserver.repository;

import com.example.authserver.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Client findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM clients WHERE id=?",
                new Object[]{id},
                new BeanPropertyRowMapper<Client>(Client.class));
    }
}
