package demoapp.controller;

import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonProducerController {

    @RequestMapping(value = "/getJson",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String getJson() {

        return new JSONObject("{\n" +
                "   type: \"success\",\n" +
                "   value: {\n" +
                "      id: 10,\n" +
                "      quote: \"Really loving Spring Boot, makes stand alone Spring apps easy.\"\n" +
                "   }\n" +
                "}").toString();

    }

}
