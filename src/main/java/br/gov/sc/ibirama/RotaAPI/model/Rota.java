/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.sc.ibirama.RotaAPI.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Gabriel Soares
 */
@Entity
public class Rota implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nomeRua;
    private String segundaManha;
    private String segundaTarde;
    private String tercaManha;
    private String tercaTarde;
    private String quartaManha;
    private String quartaTarde;
    private String quintaManha;
    private String quintaTarde;
    private String sextaManha;
    private String sextaTarde;
    private String sabadoManha;
    private String sabadoTarde;
    private String bairro;
    private String tipoColeta;

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTipoColeta() {
        return tipoColeta;
    }

    public void setTipoColeta(String tipoColeta) {
        this.tipoColeta = tipoColeta;
    }
    
    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getSegundaManha() {
        return segundaManha;
    }

    public void setSegundaManha(String segundaManha) {
        this.segundaManha = segundaManha;
    }

    public String getSegundaTarde() {
        return segundaTarde;
    }

    public void setSegundaTarde(String segundaTarde) {
        this.segundaTarde = segundaTarde;
    }

    public String getTercaManha() {
        return tercaManha;
    }

    public void setTercaManha(String tercaManha) {
        this.tercaManha = tercaManha;
    }

    public String getTercaTarde() {
        return tercaTarde;
    }

    public void setTercaTarde(String tercaTarde) {
        this.tercaTarde = tercaTarde;
    }

    public String getQuartaManha() {
        return quartaManha;
    }

    public void setQuartaManha(String quartaManha) {
        this.quartaManha = quartaManha;
    }

    public String getQuartaTarde() {
        return quartaTarde;
    }

    public void setQuartaTarde(String quartaTarde) {
        this.quartaTarde = quartaTarde;
    }

    public String getQuintaManha() {
        return quintaManha;
    }

    public void setQuintaManha(String quintaManha) {
        this.quintaManha = quintaManha;
    }

    public String getQuintaTarde() {
        return quintaTarde;
    }

    public void setQuintaTarde(String quintaTarde) {
        this.quintaTarde = quintaTarde;
    }

    public String getSextaManha() {
        return sextaManha;
    }

    public void setSextaManha(String sextaManha) {
        this.sextaManha = sextaManha;
    }

    public String getSextaTarde() {
        return sextaTarde;
    }

    public void setSextaTarde(String sextaTarde) {
        this.sextaTarde = sextaTarde;
    }

    public String getSabadoManha() {
        return sabadoManha;
    }

    public void setSabadoManha(String sabadoManha) {
        this.sabadoManha = sabadoManha;
    }

    public String getSabadoTarde() {
        return sabadoTarde;
    }

    public void setSabadoTarde(String sabadoTarde) {
        this.sabadoTarde = sabadoTarde;
    }

 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rota)) {
            return false;
        }
        Rota other = (Rota) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rota{" + "id=" + id + ", nomeRua=" + nomeRua + ", segundaManha=" + segundaManha + ", segundaTarde=" + segundaTarde + ", tercaManha=" + tercaManha + ", tercaTarde=" + tercaTarde + ", quartaManha=" + quartaManha + ", quartaTarde=" + quartaTarde + ", quintaManha=" + quintaManha + ", quintaTarde=" + quintaTarde + ", sextaManha=" + sextaManha + ", sextaTarde=" + sextaTarde + ", sabadoManha=" + sabadoManha + ", sabadoTarde=" + sabadoTarde + ", bairro=" + bairro + ", tipoColeta=" + tipoColeta + '}';
    }

}
