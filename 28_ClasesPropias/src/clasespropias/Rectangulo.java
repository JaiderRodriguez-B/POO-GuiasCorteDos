/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasespropias;

/**
 *
 * @author Asus
 */
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
        this.base = 100;
        this.altura = 50;
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

    public void Cuadrar() {
        this.altura = this.base;
    }

    public void mostrarInfo() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + getArea());
        System.out.println("Perímetro: " + getPerimetro());
    }

    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo();
        rect.mostrarInfo();

        rect.setBase(80);
        rect.setAltura(40);
        System.out.println("\nDespués de modificar valores:");
        rect.mostrarInfo();

        rect.Cuadrar();
        System.out.println("\nDespués de aplicar Cuadrar:");
        rect.mostrarInfo();
    }
}
