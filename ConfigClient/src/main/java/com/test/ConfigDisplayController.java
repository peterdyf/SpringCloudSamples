package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigDisplayController {
 
    @Value("${prefix1.key1}") String value1;

    @Autowired
    ConfigDisplayService configDisplayService;
  
    @RequestMapping("/key1")
    public String key1() {
        return "key1 : " + value1 + "\n" + "key1 from service:" + configDisplayService.getKey1();
    }


}