package com.generation.ejercicio2302.models;

//aqui se dice que gato hereda los atributos y metodos del animal
public class Gato extends Animal{
    public Integer cantidadBigotes;

    //el constructor por defecto de una clase hija debe tener
    //por defecto la funcion super();
    //para asi obtener los atributos del animal
    public Gato(){
        super();
    }

    //se le da click al que contiene todo los atributos para heredar
    //luego el atributo de este animal
    public Gato(String nombre, String raza, String pelaje, Boolean vacunado, Integer cantidadBigotes) {
        super(nombre, raza, pelaje, vacunado);
        this.cantidadBigotes = cantidadBigotes;
    }


    public Integer getCantidadBigotes() {
        return cantidadBigotes;
    }


    public void setCantidadBigotes(Integer cantidadBigotes) {
        this.cantidadBigotes = cantidadBigotes;
    }

    public void manullar(){
        System.out.println("Miau :3");
    }

    //va a colocar solo el atributo gato
    //para que parezca lo de animal concatena super.toString() 
    @Override
    public String toString() {
        return super.toString() + "Gato [cantidadBigotes=" + cantidadBigotes + "]";
    }

    
    
}
