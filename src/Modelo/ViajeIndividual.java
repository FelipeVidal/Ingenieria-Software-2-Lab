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
public class ViajeIndividual extends Viaje {
 // Constructor
    public ViajeIndividual(String pOrigen, String pDestino,int pCosto,Date pFechaSal,Date pFechaLlegada){
     this.origen=pOrigen;
     this.destino=pDestino;
     this.costo=pCosto;
     this.fechaSalida=pFechaSal;
     this.fechaLlegada=pFechaLlegada;
 }
 @Override
 public String descripcion() {
 return "Disfruta tu viaje individual";
 }
 //No se sobreescribe cualquierMetodo2()
}

