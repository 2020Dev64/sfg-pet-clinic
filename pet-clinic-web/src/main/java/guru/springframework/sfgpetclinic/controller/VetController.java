package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.htmlgit add"})
    public String listVets(){

        // corresponds to directory templates --> vets --> index
        return "vets/index";
    }
}
