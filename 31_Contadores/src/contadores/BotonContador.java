/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadores;

import javax.swing.JButton;

/**
 *
 * @author Asus
 */
public class BotonContador extends JButton{

    /**
     * @param args the command line arguments
     */
    //propiedades
    int pulsaciones;

    //constructor
    public BotonContador() {
    	pulsaciones=0;
    }

    //métodos

    //asigna una cantidad de pulsaciones
    public void setPulsaciones(int p) {
    	pulsaciones=p;
    }

    //devuelve las pulsaciones del botón
    public int getPulsaciones() {
    	return pulsaciones;
    }

    //incrementa en uno las pulsaciones
    public void incrementa() {
	pulsaciones++;
    }

    //decrementa en uno las pulsaciones
    public void decrementa() {
	pulsaciones--;
    }

    //pone las pulsaciones a cero
    public void reiniciar() {
	pulsaciones=0;
    }

    //aumenta las pulsaciones en una cantidad c
    public void aumenta(int c) {
	pulsaciones=pulsaciones+c;
    }

    //disminuye las pulsaciones en una cantidad c
    public void disminuye(int c) {
    	pulsaciones=pulsaciones-c;
    }
    
}
