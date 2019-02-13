/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4david;

/**
 *
 * @author David
 */
public class Leyenda {

   private String nombre;
   private String pasiva;
   private String skin;

    public Leyenda() {
        nombre = "Mirage";
        pasiva = "Desaparece";
        skin = "camuflaje";
    }

    public Leyenda(String nombre, String pasiva, String skin) {
        this.nombre = nombre;
        this.pasiva = pasiva;
        this.skin = skin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPasiva() {
        return pasiva;
    }

    public String getSkin() {
        return skin;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPasiva(String pasiva) {
        this.pasiva = pasiva;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    @Override
    public String toString() {
        return "Leyenda{" + "nombre=" + nombre + ", pasiva=" + pasiva + ", skin=" + skin + '}';
    }
    
    
   
    
}
