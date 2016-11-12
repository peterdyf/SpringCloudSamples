package com.test.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaConsumerController {

    @Autowired
    LoadBalancerClient client;

    @RequestMapping("/test")
    public  String test() {
        ServiceInstance instance = client.choose("eureka-client-subject");
        return (new RestTemplate()).getForObject(instance.getUri(),String.class);
    }
}