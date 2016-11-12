package hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixConsumerController {

    @Autowired
    EurekaHystrixClient client;

    @RequestMapping("/test")
    @HystrixCommand(fallbackMethod="getFallbackSubject")
    public  String test() {
        return client.getWord();
    }

    public  String getFallbackSubject() {
        return "default";
    }
}