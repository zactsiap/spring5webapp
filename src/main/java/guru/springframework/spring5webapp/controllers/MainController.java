package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {



    public MainController() {
    }

    @RequestMapping("/")
    public String geMain(Model model){
        return "index";
    }
}
