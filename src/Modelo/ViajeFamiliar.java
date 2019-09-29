/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Felipe
 */
public class ViajeFamiliar extends Viaje {

    /**
     * Cantidad de integrantes de la familia
     */
    private int familia;

    /*
 protected String origen;
 protected String destino;
 protected int costo;
 protected Date fechaSalida;
 protected Date fechaLlegada;
     */
    public ViajeFamiliar(String pOrigen, String pDestino, int pCosto, Date pFechaSal, Date pFechaLlegada, int pFamilia) {
        this.familia = pFamilia;
        this.origen = pOrigen;
        this.destino = pDestino;
        this.costo = pCosto;
        this.fechaSalida = pFechaSal;
        this.fechaLlegada = pFechaLlegada;
    }

    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }

    //Constructor getters and setters
    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }

    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje familiar";
    }
}
