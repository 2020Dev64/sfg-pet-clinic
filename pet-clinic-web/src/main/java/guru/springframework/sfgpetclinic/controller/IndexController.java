package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    // Bij een request naar de root context zal dit overeenkomen met de string lijst in de requestmapping
    // When starting spring and yoor page isn't going up look for the requestmapping handler to know the issue
    @RequestMapping({"", "/", "index", "index.html"})

    // with the return "index" the index.html page will be found
    public String index(){

        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler(){
        return "notimplemented";
    }
}
