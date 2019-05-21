package br.gov.sc.ibirama.RotaAPI;

import br.gov.sc.ibirama.RotaAPI.model.LeitorCSV;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RotaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RotaApiApplication.class, args);

        String url = "C:\\Users\\42519630833\\Desktop\\Projetos Bolsa\\FrontEnd\\rotas.csv";
        LeitorCSV leitor = new LeitorCSV();
        try {
            leitor.lerArquivo(url);
        } catch (IOException ex) {
            Logger.getLogger(RotaApiApplication.class.getName()).log(Level.SEVERE, null, ex);
    }

}
}
