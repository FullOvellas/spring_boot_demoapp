package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    public String saluda(String nombre) {
        return "Hola " + nombre;
    }

    public String ageAndIdMessage(int age, String dni) {

        return "Tu edad es: " + age + " y tu DNI es: " + dni;

    }

}