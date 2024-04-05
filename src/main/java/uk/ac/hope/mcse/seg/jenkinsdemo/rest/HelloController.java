package uk.ac.hope.mcse.seg.jenkinsdemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.ac.hope.mcse.seg.jenkinsdemo.service.HelloService;

@RestController
public class HelloController {

    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    String getHello() {
        return helloService.getHello();
    }

}
