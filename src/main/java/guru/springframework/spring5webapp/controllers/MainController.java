package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    private String welcomePage;

    public MainController() {
        welcomePage = "index";
    }

    @GetMapping(path = "/")
    public String getMain(Model model) {
        return welcomePage;
    }
}
