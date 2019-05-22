/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.sc.ibirama.RotaAPI.repositorio;

import br.gov.sc.ibirama.RotaAPI.model.Rota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Gabriel Soares
 */
public interface RotaRepositorio extends JpaRepository<Rota, Long> {

    @Query(value = "DELETE FROM public.rota;", nativeQuery = true)
    void limparTabelaExistente();

}
