package demoapp.controller;

import demoapp.service.DespedidaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DespedidaController {

    private final DespedidaService despedidaService;

    public DespedidaController(DespedidaService despedidaService) {

        this.despedidaService = despedidaService;

    }

    @RequestMapping("/despedida/{nombre}")
    public @ResponseBody String despedida(@PathVariable(value = "nombre") String nombre) {

        return despedidaService.despedir(nombre);

    }

}
