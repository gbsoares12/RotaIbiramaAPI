/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.sc.ibirama.RotaAPI.model;

import br.gov.sc.ibirama.RotaAPI.repositorio.RotaRepositorio;
import br.gov.sc.ibirama.RotaAPI.resources.RotaResources;
import com.google.gson.Gson;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Gabriel Soares
 */
public class LeitorCSV {

    public void lerArquivo(String url) throws IOException {

        Gson gson = new Gson();
        Reader reader = Files.newBufferedReader(Paths.get(url));
        CSVReader csvReader = new CSVReaderBuilder(reader)
                .withSkipLines(1)//para o caso do CSV ter cabeçalho.
                .build();

        List<String[]> linhas = csvReader.readAll();
        List<String> listaJson;

        String[] colunas = null;

//        String json = gson.toJson(linha);
        for (String[] linha : linhas) {
            Rota rotaNova = new Rota();
            rotaNova.setId(Long.parseLong(linha[0]));
            rotaNova.setNome_rua(linha[2]);
            rotaNova.setSegunda_manha(linha[9]);
            rotaNova.setSegunda_tarde(linha[10]);
            rotaNova.setTerca_manha(linha[13]);
            rotaNova.setTerca_tarde(linha[14]);
            rotaNova.setQuarta_manha(linha[3]);
            rotaNova.setQuarta_tarde(linha[4]);
            rotaNova.setQuinta_manha(linha[5]);
            rotaNova.setQuinta_tarde(linha[6]);
            rotaNova.setSexta_manha(linha[11]);
            rotaNova.setSexta_tarde(linha[12]);
            rotaNova.setSabado_manha(linha[7]);
            rotaNova.setSabado_tarde(linha[8]);
            rotaNova.setBairro(linha[1]);
            rotaNova.setTipo_coleta(linha[15]);
            salvarRotasNovas(rotaNova);
        }
    }

    public void salvarRotasNovas(Rota novaRota) {
  
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.gov.sc.ibirama_RotaAPI_jar_0.0.1-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        try {

            em.persist(novaRota);
            em.getTransaction().commit();
            System.out.println(novaRota.toString());

        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {

            em.close();

        }
    }
}
