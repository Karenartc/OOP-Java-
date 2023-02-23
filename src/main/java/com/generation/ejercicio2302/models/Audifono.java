package com.generation.ejercicio2302.models;

public class Audifono {

public String marca;
public Double tamanio;
public String color;
public String tipoConexion;
public String cancelacionRuido;



public Audifono() {
}

public Audifono(String marca, Double tamanio, String color, String tipoConexion, String cancelacionRuido) {
    this.marca = marca;
    this.tamanio = tamanio;
    this.color = color;
    this.tipoConexion = tipoConexion;
    this.cancelacionRuido = cancelacionRuido;
}



public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public Double getTamanio() {
    return tamanio;
}

public void setTamanio(Double tamanio) {
    this.tamanio = tamanio;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

public String getTipoConexion() {
    return tipoConexion;
}

public void setTipoConexion(String tipoConexion) {
    this.tipoConexion = tipoConexion;
}

public String getCancelacionRuido() {
    return cancelacionRuido;
}

public void setCancelacionRuido(String cancelacionRuido) {
    this.cancelacionRuido = cancelacionRuido;
}

public void escuchar(){
    System.out.println("Esta escuchadno su musica favorita");
}



public String manosLibres (boolean tiene){
    if(tiene == true){
        return ("Puede hablar por los audifonos");
    }else{
        return ("No puede hablar por los audifonos");
    }
}

public void ecualizador(){
    System.out.println("Puede manejar el volumen y calidad de su audio");
}

public void sonido3D(boolean tiene3D){
    if(tiene3D == true){
        System.out.println("Tienes mejor experiencia de audio");
    }else{
        System.out.println("Comprate mejores audifonos");
    }
}

public void compatibilidad(boolean funciona){
    if(funciona == true){
        System.out.println("Excelente, disfruta tus audifonos");
    }else{
        System.out.println("Comprate otros audifonos");
    }
}


}
