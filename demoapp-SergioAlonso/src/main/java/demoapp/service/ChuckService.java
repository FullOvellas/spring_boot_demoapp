package demoapp.service;

import demoapp.model.Quote;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Service
public class ChuckService {

    private final RestTemplate restTemplate;

    public ChuckService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Quote getQuote() {

        return restTemplate.getForObject("https://api.chucknorris.io/jokes/random", Quote.class);

    }

}
