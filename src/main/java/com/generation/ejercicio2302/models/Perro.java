package com.generation.ejercicio2302.models;

public class Perro {

    //---------------------Inicio Atributos
    //cuando creamos atributos de objetos
    //podemos determinar si el atributo es privado o publico
    //esto va a depender de la sensibilidad del dato
    public String raza;
    public String color;
    public Double tamanio;
    public String pelaje;
    public char sexo;
    private Integer chip;
    //---------------------Fin Atributos



    //---------------------Inicio Constructores
    //constructor por defecto
    //este tipo de constructor debe ir si o si en Todas las Clases
    public Perro() {
    }

    //constructor de objeto completo
    //Este tambien debe estar en Todas las clases que creemos
    public Perro(String raza, String color, Double tamanio, String pelaje, char sexo, Integer chip) {
        this.raza = raza;
        this.color = color;
        this.tamanio = tamanio;
        this.pelaje = pelaje;
        this.sexo = sexo;
        this.chip = chip;
    }
    //---------------------Fin Constructores



    //---------------------Inicio Getters y Setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Integer getChip() {
        return chip;
    }

    public void setChip(Integer chip) {
        this.chip = chip;
    }
    //---------------------Fin Getters y Setters



    //---------------------Inicio Funcionalidades
    public void ladrar(){
        System.out.println("Guau!");
    }

    public String romperCosas(boolean meRetaron){
        if(meRetaron == true){
            return "Destrozo";
        }else{
            return "No destrozo";
        }
    }

    public String cavar(){
        return "El perro cavó un hoyo en el patio";
    }
    //---------------------Fin Funcionalidades

    @Override
    public String toString() {
        return "\nPerro { raza: " + raza + ", color: " + color + ", tamaño: " + tamanio + ", pelaje: " + pelaje + ", sexo: "
                + sexo + ", chip: " + chip + " }";
    }

    
}
