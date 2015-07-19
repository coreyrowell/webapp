package com.springapp.mvc;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapp.mvc.domain.Message;

@RestController
@RequestMapping("/hello")
public class HelloWorldRestController {

    @RequestMapping("/{name}")
    public Message message(@PathVariable String name) {
        return new Message(name, "Hello " + name);
    }

}