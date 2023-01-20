package demoapp.controller;

import demoapp.service.ChuckService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckController {

    private final ChuckService chuckService;

    public ChuckController(ChuckService chuckService) {

        this.chuckService = chuckService;

    }

    @RequestMapping("/chuck")
    public String mostrarChiste(Model model) {

        model.addAttribute("quote", chuckService.getQuote());

        return "chuck";

    }


}
