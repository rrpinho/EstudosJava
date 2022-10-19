package api.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //O Spring encontra e gerencia como um Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody //Informa para o Spring retornar essa String. Por padrão deveria retornar uma página.
    public String hello() {
        return "Hello World! 2.0";
    }
}
