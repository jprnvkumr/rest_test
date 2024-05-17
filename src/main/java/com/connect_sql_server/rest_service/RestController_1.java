package com.connect_sql_server.rest_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
public class RestController_1 {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        String sqlQuery = "SELECT TOP 50 customer_id, customer_name, is_enabled, map_group_id FROM dbo.Customer";
        List<Customer> customers = jdbcTemplate.query(sqlQuery, (resultSet, i) -> {
            Customer customer = new Customer();
            customer.setCustomerName(resultSet.getString("customer_name"));
            customer.setEnabled(resultSet.getBoolean("is_enabled"));
            customer.setMapGroupId(resultSet.getInt("map_group_id"));
            customer.setCustomerId(resultSet.getInt("customer_id"));

            return customer;
        });
        return customers;
    }
}

