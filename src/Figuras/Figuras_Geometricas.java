package Figuras;

public class Figuras_Geometricas {
    public int Nlados;
    public  String nombre;


    public Figuras_Geometricas( int Nlados, String nombre){
        this.Nlados = Nlados;
        this.nombre = nombre;


    }

    public String getNombre() {
        return nombre;
    }

    public  void mostrar_datos(){
        System.out.println("------------------------------\n");
        System.out.println("           Bienvenido        \n");
        System.out.println("Datos: \n");
        System.out.println("Nombre de la figura geometrica: "+nombre+ "\n");
        System.out.println("Numero de lados: "+Nlados+"\n");




    }




}
