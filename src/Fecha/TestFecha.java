package Fecha;

public class TestFecha {
    public static void main(String[] args) {
        mostrar1();
    }
    public static void mostrar1(){
        Fecha fec1=new Fecha(16,01,2021);
        fec1.mostrarFormatoES();
        fec1.mostrarFormatoGB();
        fec1.mostrarFormatoTexto();
        System.out.println("La fecha e correcta :"+fec1.isCorrecta());
        System.out.println("La fecha es festivo :"+fec1.isFestivo());
        System.out.println("El dia de la semana es :"+fec1.getDiaSemana());
    }
}
