package guru.springframework.sfgpetclinic.controller;

import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// Now owners is prefixed
@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    // No auto wire needed but preferred
    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/index", "/index.html"})
    public String listOwners(Model model){

        // gives back a set, when called by Spring MVC spring MVC is gonne inject the model
        // When it runs its going to add in an attribute called owner
        // and return back the owner index page
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

    @RequestMapping("/find")
    public String findOwners(){
        return "notimplemented";
    }
}
