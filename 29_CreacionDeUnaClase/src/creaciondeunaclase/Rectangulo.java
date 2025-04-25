package creaciondeunaclase;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return base * altura;
    }

    public double getPerimetro() {
        return 2 * (base + altura);
    }
    
    public double cuadrar(double altura, double base){
        double alt = altura;
        double bas = base;
        if(alt != bas){
           alt = base;
        }
        altura= alt;
        return altura;        
    }

    public static void main(String[] args) {
        
        Rectangulo rec = new Rectangulo();

        rec.setBase(30);
        rec.setAltura(50);

        double area = rec.getArea();
        double peri = rec.getPerimetro();

        System.out.println("Base: " + rec.getBase());
        System.out.println("Altura: " + rec.getAltura());
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + peri);
        
        rec.setAltura(rec.cuadrar(50, 30)); 
        System.out.println("\nAltura cuadrada:"+rec.altura+" \nBase cuadrada: "+rec.base);
        
    }

}
