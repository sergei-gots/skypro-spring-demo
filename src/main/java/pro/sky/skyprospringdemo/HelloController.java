package pro.sky.skyprospringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloServiceInterface helloService;
    public HelloController(HelloServiceInterface helloService) {
        this.helloService = helloService;
    }
    @GetMapping
    public String hello() {
        return helloService.hello();
    }
    @GetMapping(path = "/hello")
    public String answerHello(@RequestParam("name") String userName) {
        return helloService.answerHello(userName);
    }
}
