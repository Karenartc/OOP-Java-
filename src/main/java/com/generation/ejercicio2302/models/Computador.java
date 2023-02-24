package com.generation.ejercicio2302.models;

public class Computador extends ArticuloElectronico{
   
	public Integer capacidad;
    public String procesador;
   

    public Computador() {
        super();
    }


    public Computador(String marca, String modelo, String color, String sistemaOperativo, Integer tamanio,
            Boolean bluetooth, Integer capacidad, String procesador) {
        super(marca, modelo, color, sistemaOperativo, tamanio, bluetooth);
        this.capacidad = capacidad;
        this.procesador = procesador;
    }


    public Integer getCapacidad() {
        return capacidad;
    }


    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }


    public String getProcesador() {
        return procesador;
    }


    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }


    public void jugar(){
        System.out.println("Abrir WarZone");
    }

    @Override
    public String toString() {
        return super.toString() + "Computador [capacidad=" + capacidad + ", procesador=" + procesador + "]";
    }


    
    

    



}
