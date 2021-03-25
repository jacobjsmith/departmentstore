package com.jacobstuff.departmentstore.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloRestController {

    @RequestMapping(value = "/")
    public String hello()
    {
        return "Hello User";
    }
}
