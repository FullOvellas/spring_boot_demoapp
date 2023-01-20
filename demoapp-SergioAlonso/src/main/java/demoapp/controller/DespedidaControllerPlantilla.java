package demoapp.controller;

import demoapp.model.UserData;
import demoapp.service.DespedidaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DespedidaControllerPlantilla {

    private final DespedidaService despedidaService;

    public DespedidaControllerPlantilla(DespedidaService despedidaService) {

        this.despedidaService = despedidaService;

    }

    @RequestMapping("/despedidaplantilla/{nombre}")
    public String despedida(@PathVariable(value = "nombre") String nombre, Model model) {

        model.addAttribute("despedida", despedidaService.despedir(nombre));

        return "despedida";

    }

}
