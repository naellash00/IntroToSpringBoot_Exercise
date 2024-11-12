package com.example.exercisespring1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class welcomeController {

    @GetMapping(path = "/name")
    public String name(){
        return "My Name is Naelah";
    }

    @GetMapping(path = "/age")
    public String age(){
        return "My age is 24";
    }

    @GetMapping(path = "/check/status")
    public String checkStatus(){
        return "Everything OK";
    }

    @GetMapping(path = "/health")
    public String health(){
       return "Server health is up and running";
    }

    @GetMapping(path = "/names")
    public ArrayList names(){
        ArrayList names = new ArrayList();
        names.add("Naelah");
        names.add("lena");
        names.add("ghada");
        return names;
    }



}
