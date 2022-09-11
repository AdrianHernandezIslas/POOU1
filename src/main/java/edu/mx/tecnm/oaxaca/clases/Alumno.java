/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mx.tecnm.oaxaca.clases;

import java.util.Date;

/**
 *
 * @author shaka
 */
public class Alumno {
    
    private String numeroControl;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private String curp;
    private char genero;
    private double estaturaEnCm;
    
    public Alumno(){
    }

    public Alumno(String numeroControl, String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, String curp, char genero) {
        this.numeroControl = numeroControl;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.curp = curp;
        this.genero = genero;
    }

    public Alumno(String numeroControl, String nombre, String primerApellido) {
        this.numeroControl = numeroControl;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
    }
    
    
    
    public String caminar(){
        // Adrian Esta caminando
        return nombre + " Esta caminando ";
    }
    
    public String caminar(String mensaje){
        return nombre + mensaje;
    }
    
    public void nacer(){
        System.out.println("Ya naci :)");
    }
    
    public void nacer(String mensaje){
        System.out.println(mensaje);
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getEstaturaEnCm() {
        return estaturaEnCm;
    }

    public void setEstaturaEnCm(double estaturaEnCm) {
        this.estaturaEnCm = estaturaEnCm;
    }
    
    
    
    
    
    
}
