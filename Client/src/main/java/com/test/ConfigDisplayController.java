package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigDisplayController {
 
      @Value("${key1}") String value1;
  
      @RequestMapping("/key1")
      public String key1() {
        return "key1 value: " + value1;
      }
}