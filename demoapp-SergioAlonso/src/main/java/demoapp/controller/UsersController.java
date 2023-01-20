package demoapp.controller;

import demoapp.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsersController {

    UsersService service;

    public UsersController(UsersService service) {
        this.service = service;
    }

    @RequestMapping("/users")
    public String showUsers(Model model) {

        model.addAttribute("users", service.getAllUsers());

        return "users";

    }

}
