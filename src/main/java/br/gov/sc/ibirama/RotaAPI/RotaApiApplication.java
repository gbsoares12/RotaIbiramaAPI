package br.gov.sc.ibirama.RotaAPI;

import br.gov.sc.ibirama.RotaAPI.model.LeitorCSV;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@SpringBootApplication
public class RotaApiApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(RotaApiApplication.class, args);

//        String url = "C:\\Users\\Gabriel Soares\\Desktop\\falculdade\\Bolsa\\FrontEnd\\rotas.csv";
    }
}
