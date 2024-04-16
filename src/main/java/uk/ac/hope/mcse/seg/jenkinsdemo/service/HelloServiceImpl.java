package uk.ac.hope.mcse.seg.jenkinsdemo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String getHello() {
        return new String("Hello World");
    }

    @Override
    public String getGoodbye() {
        return new String("Goodbye");
    }


}
