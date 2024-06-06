package Figuras;

public class Figura_2D extends Figuras_Geometricas {
    public double area;
    public double perimetro;

    public Figura_2D( int Nlados, String nombre, double area, double perimetro){
        super(  Nlados,  nombre);
        this.area = area;
        this.perimetro = perimetro;


    }


    public double  calcular_area(double base, int Numerodelados){
       return area;

    }
    public double calcular_perimetro(){
        return perimetro;



    }
}
