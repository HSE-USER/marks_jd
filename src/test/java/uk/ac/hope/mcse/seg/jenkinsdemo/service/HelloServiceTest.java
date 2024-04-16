package uk.ac.hope.mcse.seg.jenkinsdemo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloServiceTest {

    @Test
    public void testHelloWorld() {
        HelloService helloService = new HelloServiceImpl();
        String result = helloService.getHello();
        assertEquals("Hello World", result);
    }

    @Test
    public void testGoodbye() {
        HelloService helloService = new HelloServiceImpl();
        String result = helloService.getGoodbye();
        assertEquals("Goodbye", result);
    }


}