package com.generation.ejercicio2302.models;

public class Smartphone extends ArticuloElectronico{

public Integer capacidad;
public String procesador;
public Boolean camara;


public Smartphone() {
    super();
}


public Smartphone(String marca, String modelo, String color, String sistemaOperativo, Integer tamanio,
        Boolean bluetooth, Integer capacidad, String procesador, Boolean camara) {
    super(marca, modelo, color, sistemaOperativo, tamanio, bluetooth);
    this.capacidad = capacidad;
    this.procesador = procesador;
    this.camara = camara;
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


public Boolean getCamara() {
    return camara;
}


public void setCamara(Boolean camara) {
    this.camara = camara;
}

public void grabar(){
    System.out.println("Grabó su TikTok");
}

@Override
public String toString() {
    return super.toString() + "Smartphone [capacidad=" + capacidad + ", procesador=" + procesador + ", camara=" + camara + "]";
}


}
