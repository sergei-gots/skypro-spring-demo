package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloServiceInterface {
    @Override
    public String hello() {
        return "<b>hello</b>";
    }

    @Override
    public String answerHello(String userName) {
        return "<b>hello, " + userName + ":)</b>";
    }
}
