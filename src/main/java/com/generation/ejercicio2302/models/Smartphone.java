package com.generation.ejercicio2302.models;

public class Smartphone {

public String marca;
public String modelo;
public String color;
public Integer capacidad;
public String sistemaOperativo;


public Smartphone() {
}

public Smartphone(String marca, String modelo, String color, Integer capacidad, String sistemaOperativo) {
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.capacidad = capacidad;
    this.sistemaOperativo = sistemaOperativo;
}


public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

public Integer getCapacidad() {
    return capacidad;
}

public void setCapacidad(Integer capacidad) {
    this.capacidad = capacidad;
}

public String getSistemaOperativo() {
    return sistemaOperativo;
}

public void setSistemaOperativo(String sistemaOperativo) {
    this.sistemaOperativo = sistemaOperativo;
}


public void llamar(boolean contestar){
    if(contestar = true){
        System.out.println("Alo?");
    }else{
        System.out.println("Deje su mensaje en el buzon de voz");
    }
}

public void escribir(){
    System.out.println("Esta ecribiendo un mensaje...");
}

public void grabar(){
    System.out.println("Esta grabando un video...");
}

public void buscarInternet(){
    System.out.println("Google");
}

public void interactuarApp(){
    System.out.println("Bienvenido a Instagram");
}

}
