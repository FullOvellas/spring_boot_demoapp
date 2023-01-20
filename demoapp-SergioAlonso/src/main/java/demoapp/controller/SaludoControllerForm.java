package demoapp.controller;

import demoapp.model.UserData;
import demoapp.model.UserRepository;
import demoapp.service.SaludoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class SaludoControllerForm {

    private final SaludoService saludoService;
    private final UserRepository repository;

    public SaludoControllerForm(SaludoService saludoService, UserRepository repository) {
        this.saludoService = saludoService;
        this.repository = repository;
    }

    @GetMapping("/saludoform")
    public String saludoForm(UserData userData) {
        return "saludoform";
    }

    @PostMapping("/saludoform")
    public String checkPersonInfo(@ModelAttribute @Valid UserData userData,
                                  BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "saludoform";
        }

        repository.save(userData);

        model.addAttribute("saludo",
                saludoService.saluda(userData.getNombre()));
        model.addAttribute("mensaje", saludoService.ageAndIdMessage(userData.getEdad(), userData.getDni()));
        return "saludo_extra";
    }

}
