package com.test.eureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class EurekaController {

    public static final String NAME="N"+new Random().nextInt(100);


    @RequestMapping("/")
    public  String get() {
        return String.valueOf(NAME+":"+new Random().nextInt(1000));
    }
}