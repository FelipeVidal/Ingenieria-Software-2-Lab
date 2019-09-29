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
public class ViajeIncentivo extends Viaje {
 /**
 * Empresa que patrocina el viaje al empleado
 */private String empresa;
 
    public ViajeIncentivo( String pOrigen, String pDestino,int pCosto,Date pFechaSal,Date pFechaLlegada, String pEmpresa){
     this.origen=pOrigen;
     this.destino=pDestino;
     this.costo=pCosto;
     this.fechaSalida=pFechaSal;
     this.empresa=pEmpresa;
     this.fechaLlegada=pFechaLlegada;
 }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
 
 //Constructor, getters and setters
 @Override
 public String descripcion() {
 return "Viaje incentivo que te envia la empresa " + empresa;
 }

 public String cualquierMetodo2() {
 return "Método implementado en la clase hija viaje de incentivo";
 }
}