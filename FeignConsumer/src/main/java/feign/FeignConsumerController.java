package feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignConsumerController {

    @Autowired
    EurekaFeignClient client;

    @RequestMapping("/test")
    public  String test() {
        return client.getWord();
    }
}