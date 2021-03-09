package Fecha;

public class TestFecha {
    public static void main(String[] args) {
        mostrar1();
    }
    public static void mostrar1(){
        Fecha fec1=new Fecha(16,1,2021);
        System.out.println();
        System.out.println("--- Creo un nuevo onjeto utilizando el constructor parametrizado int int itn ("+fec1.getDia()+","+fec1.getMes()+","+ fec1.getAnyo()+")---");
        System.out.println();
        fec1.mostrarFormatoES();
        fec1.mostrarFormatoGB();
        fec1.mostrarFormatoTexto();
        System.out.println("La fecha e correcta :"+fec1.isCorrecta());
        System.out.println("La fecha es festivo :"+fec1.isFestivo());
        System.out.println("El dia de la semana es :"+fec1.getDiaSemana());
    }
    public static void mostrar2(){

    }
}
