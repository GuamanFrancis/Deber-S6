package Figuras;

public class Otros extends Figura_2D {
    public double apotema;
    public int lado;


    public Otros(int Nlados, String nombre,double area,double perimetro, int lado, double apotema){
        super(Nlados,nombre,area,perimetro);
        this.apotema = apotema;
        this.lado = lado;


    }

    @Override
    public double calcular_perimetro(){
        return lado*Nlados;

    }


    public double calcular_area(){
        return (perimetro*apotema)/2;

    }


    public void mostrarInf(){
        mostrarInf();
        System.out.println("El area del "+nombre+" es de: "+calcular_area());
        System.out.println("El perimetro del "+nombre+" es de: "+calcular_perimetro());

    }
}
