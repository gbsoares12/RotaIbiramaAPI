/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.sc.ibirama.RotaAPI.resources;

import br.gov.sc.ibirama.RotaAPI.model.Rota;
import br.gov.sc.ibirama.RotaAPI.repositorio.RotaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/rotasIbirama")
public class RotaResources {

    @Autowired
    private RotaRepositorio rr;
    
    @CrossOrigin
    @GetMapping
    public List<Rota> buscar() {
        return rr.findAll();
    }
    
    
}
