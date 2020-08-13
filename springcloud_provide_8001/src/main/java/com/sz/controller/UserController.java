package com.sz.controller;

import com.sz.admin.User;
import com.sz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @Autowired
    private DataSource dataSource;

    @GetMapping("/getAll")
    @ResponseBody
    public List<User> ByUserAll(){
        return iUserService.ByUserAll();
    }

    @RequestMapping(value = "getId/{id}",method = RequestMethod.GET)
    @ResponseBody
    public User ByUserId(@PathVariable(name = "id") int id){
        return iUserService.ByUserId(id);
    }


    @RequestMapping("/da")
    @ResponseBody
    public User  data(){
        try {
            System.out.println(dataSource);
        } catch (Exception e) {
            System.out.println("null");
        }
        User user=new User();
        return user;
    }

}
