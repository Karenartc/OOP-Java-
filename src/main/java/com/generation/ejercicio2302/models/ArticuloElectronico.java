package com.generation.ejercicio2302.models;

public class ArticuloElectronico {
    public String marca;
	public String modelo;
	public String color;
	public String sistemaOperativo;
    public Integer tamanio;
    public Boolean Bluetooth;
    
    public ArticuloElectronico() {
    }

    public ArticuloElectronico(String marca, String modelo, String color, String sistemaOperativo, Integer tamanio,
            Boolean bluetooth) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.sistemaOperativo = sistemaOperativo;
        this.tamanio = tamanio;
        Bluetooth = bluetooth;
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

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public Boolean getBluetooth() {
        return Bluetooth;
    }

    public void setBluetooth(Boolean bluetooth) {
        Bluetooth = bluetooth;
    }


    @Override
    public String toString() {
        return "ArticuloElectronico [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", sistemaOperativo="
                + sistemaOperativo + ", tamanio=" + tamanio + ", Bluetooth=" + Bluetooth + "]";
    }

    public void reproducirAudiovisual(){
        System.out.println("Pon tu Rolita");
    }

    public void navegar(){
        System.out.println("Abrir Navegador");
    }

    public void app(){
        System.out.println("abre YouTube");
    }

    
    
}
