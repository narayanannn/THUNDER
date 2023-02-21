package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorld {
      @GetMapping("/")
      public String hello() {
    	  return "Hello world";
      }
}
