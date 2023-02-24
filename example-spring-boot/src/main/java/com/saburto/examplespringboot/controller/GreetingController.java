package com.saburto.examplespringboot;

import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.*;
import org.springframework.beans.factory.annotation.*;
import javax.annotation.*;

@RestController
public class GreetingController {

    @Autowired
    private JdbcTemplate jdbcTemplate; //< we are using H2 Test database in memory, by default

    @PostConstruct // called by spring once! only once everytime is started
    public void init() { // < Spring calls the postConstructer after the injection of @Autowired
        // here is alredy 
        jdbcTemplate.update("create table names ( new_name varchar(255) )");
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {

        // TODO: how to retrive the name from the database using jdbc..
        return "Hello, " + name;
    }

    @PostMapping("/hello")
    public String helloPost(@RequestBody String name) {
        jdbcTemplate.update("insert into names values($1)", name);
        return "Hello, " + name;
    }

}