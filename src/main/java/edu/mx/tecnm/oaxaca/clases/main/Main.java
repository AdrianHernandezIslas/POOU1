/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mx.tecnm.oaxaca.clases.main;

import edu.mx.tecnm.oaxaca.clases.Alumno;

/**
 *
 * @author shaka
 */
public class Main {
    public static void main(String[] args) {
        Alumno alumnoChido = new Alumno();//C
        Alumno almnoConIdentidad = 
       new Alumno("15161315", "Donciano", "NoTiene","Lopex",null,"CUP", 'M');
        Alumno dormilon = new Alumno("15161264","Pedro","Pacapiedra");
     
        
        System.out.println("El nombre de alumnoChido es "
                +alumnoChido.getNombre());
        
        alumnoChido.setNombre("Isabel II");
        alumnoChido.setGenero('F');
        alumnoChido.setEstaturaEnCm(160);
        
        System.out.println("El nombre asignado de alumnoChido es "
                +alumnoChido.getNombre());
        System.out.println("La estatura de elle es "+alumnoChido.getEstaturaEnCm());
    
        System.out.println("El color de piel de "
                +alumnoChido.getNombre() + " es "
                +" ya no ta");
        
        //alumnoChido.colorDePiel = "color mole";
        
        System.out.println("El color de piel de "
                +alumnoChido.getNombre() + " es "
                +" era color axe de chocolate");
    }
}
