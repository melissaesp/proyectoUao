/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Date;
/**
 *
 * @author usuario
 */
public class Material {
    int id;
    String nombre;
    Date fecha;
    double peso;
    String tipo;
    String archivo;

    public Material(int id, String nombre, Date fecha, double peso, String tipo, String archivo) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.peso = peso;
        this.tipo = tipo;
        this.archivo = archivo;
    }

    public Material() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    
    
    
}
