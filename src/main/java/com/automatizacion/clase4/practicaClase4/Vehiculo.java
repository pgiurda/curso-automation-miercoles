package com.automatizacion.clase4.practicaClase4;

public class Vehiculo {
/*
 Se requiere crear la clase Vehiculo con los siguientes atributos:
- marca (string)
- modelo (string)
- anio (int)
Y además agregar el constructor (con todos los parámetros) y los métodos getters & setters.
En otro archivo que contenga al método main, instanciar dos objetos de la clase Vehiculo y
mostrar por pantalla la información de cada uno.
 */
   private String marca;
   private String modelo;
   private int anio;

   public Vehiculo(){
       this.marca = "";
       this.modelo = "";
       this.anio = 0;
   }
   public Vehiculo(String marca, String modelo, int anio) {
       this.marca = marca;
       this.modelo = modelo;
       this.anio = anio;
   }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo(){
       return modelo;
   }
   public void setModelo(String modelo){
       this.modelo = modelo;
   }
   public int getAnio(){
       return anio;
   }
   public void setAnio(int anio){
       this.anio = anio;
   }
}

