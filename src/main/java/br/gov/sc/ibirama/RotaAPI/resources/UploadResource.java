/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.sc.ibirama.RotaAPI.resources;

import br.gov.sc.ibirama.RotaAPI.model.LeitorCSV;
import java.io.File;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gabriel Soares
 */
@CrossOrigin(origins = "http://localhost:4200") //Configura o crossOrigin, libera o bloqueio do header
@RestController
@RequestMapping("/upload")
public class UploadResource {
    
    
    @PostMapping("/{file}")
    public void salvar(@PathVariable File arquivo) {
        System.out.println(arquivo);
   // LeitorCSV gravarArquivo = new LeitorCSV();
   // gravarArquivo.lerArquivo(arquivo);
    }
    
    public void receberArquivo(){
        
    }
}
