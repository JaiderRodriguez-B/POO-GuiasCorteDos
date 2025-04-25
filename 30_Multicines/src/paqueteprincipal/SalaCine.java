/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteprincipal;

/**
 *
 * @author Asus
 */
public class SalaCine {
    //propiedades
    int Aforo;
    int Ocupadas;
    String Pelicula;
    double Entrada;

    
    /** Creates a new instance of SalaCine */
    //Constructor
    public SalaCine() {
        Aforo = 100;
        Ocupadas = 0;
        Pelicula = "";
        Entrada = 5.0;
    }
    
    //Métodos set

    //Método setAforo
    public void setAforo(int afo) {
            Aforo = afo;
    }

    //Método setOcupadas
    public void setOcupadas(int ocu) {
            Ocupadas = ocu;
    }

    //Método setPelicula
    public void setPelicula(String peli) {
            Pelicula = peli;
    }

    //Método setEntrada
    public void setEntrada(double entra) {
            Entrada = entra;
    }

    //Método setLibres
    public void setLibres(int lib) {
            int ocu;
            ocu = Aforo - lib;
            Ocupadas = ocu;
    }

    
    //Métodos get

    //Método getAforo
    public int getAforo() {
        return Aforo;
    }

    //Método getOcupadas
    public int getOcupadas() {
        return Ocupadas;
    }

    //Método getPelicula
    public String getPelicula() {
        return Pelicula;
    }

    //Método getEntrada
    public double getEntrada() {
        return Entrada;
    }

    //Método getLibres
    public int getLibres() {
        int lib;
        lib = Aforo - Ocupadas;
        return lib;
    }

    //Método getPorcentaje
    public double getPorcentaje() {
        double por;
        por = (double) Ocupadas / (double) Aforo * 100.0;
        return por;
    }

    //Método getIngresos
    public double getIngresos() {
        double ingre;
        ingre = Ocupadas * Entrada;
        return ingre;
    }
    
    //Métodos de orden

    //Método Vaciar
    public void Vaciar() {
            Ocupadas = 0;
            Pelicula = "";
    }

    //Método entraUno
    public void entraUno() {
            Ocupadas++;
    }
    
}
