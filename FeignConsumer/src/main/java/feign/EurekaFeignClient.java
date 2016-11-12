package feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("eureka-client-subject")
public interface EurekaFeignClient {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public  String getWord();
}