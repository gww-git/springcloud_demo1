package com.sz.controller;


import com.sz.admin.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CosumterController {

    private final static String PROVIDE_HTTP="http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable(name = "id")int id){
        return restTemplate.getForObject(PROVIDE_HTTP+"/admin/getId/"+id,User.class);
    }

    @RequestMapping("/users")
    public List<User> getUserAll(){
        return restTemplate.getForObject(PROVIDE_HTTP+"/admin/getAll",List.class);
    }

}
