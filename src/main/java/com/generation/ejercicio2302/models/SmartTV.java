package com.generation.ejercicio2302.models;

public class SmartTV extends ArticuloElectronico{

    public String resolucion;
    public String tipoDePantalla;
    public Boolean controlVoz;

    
    public SmartTV() {
        super();
    }


    public SmartTV(String marca, String modelo, String color, String sistemaOperativo, Integer tamanio,
            Boolean bluetooth, String resolucion, String tipoDePantalla, Boolean controlVoz) {
        super(marca, modelo, color, sistemaOperativo, tamanio, bluetooth);
        this.resolucion = resolucion;
        this.tipoDePantalla = tipoDePantalla;
        this.controlVoz = controlVoz;
    }


    public String getResolucion() {
        return resolucion;
    }


    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }


    public String getTipoDePantalla() {
        return tipoDePantalla;
    }


    public void setTipoDePantalla(String tipoDePantalla) {
        this.tipoDePantalla = tipoDePantalla;
    }


    public Boolean getControlVoz() {
        return controlVoz;
    }


    public void setControlVoz(Boolean controlVoz) {
        this.controlVoz = controlVoz;
    }

    public void reproducir(){
        System.out.println("Reproducir Youtube y Netflix :p");
    }

    @Override
    public String toString() {
        return super.toString() + "SmartTV [resolucion=" + resolucion + ", tipoDePantalla=" + tipoDePantalla + ", controlVoz=" + controlVoz
                + "]";
    }
    

}
