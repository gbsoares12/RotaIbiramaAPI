/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.sc.ibirama.RotaAPI.resources;

import br.gov.sc.ibirama.RotaAPI.model.LeitorCSV;
import br.gov.sc.ibirama.RotaAPI.repositorio.RotaRepositorio;
import br.gov.sc.ibirama.RotaAPI.responseUpload.UploadFileResponse;
import br.gov.sc.ibirama.RotaAPI.service.FileStorageService;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author Gabriel Soares
 */
@CrossOrigin(origins = "http://localhost:4200") //Configura o crossOrigin, libera o bloqueio do header
@RestController
@RequestMapping("/upload")
public class UploadResource {

    @Autowired
    private FileStorageService fileStorageService;
    
    @Autowired
    private RotaRepositorio rr;
    
    @PostMapping
    public ResponseEntity<?> uploadFile(@RequestBody MultipartFile file) {
       
        String fileName = fileStorageService.storeFile(file);
        LeitorCSV leitor = new LeitorCSV();
        if(leitor.lerArquivo("./uploads/"+fileName)){
            rr.deleteAll();
        }
        return new ResponseEntity<>(
                new UploadFileResponse(fileName, file.getContentType(), file.getSize()),
                HttpStatus.OK);
    }
}
