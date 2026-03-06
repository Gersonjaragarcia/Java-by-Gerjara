import  java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new  Scanner(System.in);

        System.out.println("Ingresa tu nota: ");
        double nota = scanner.nextDouble();

        if (nota >= 90 && nota <= 100){
            System.out.println("EXCELENTE");

        }else if(nota >= 70 && nota <= 89 ){

            System.out.println("APROBADO");

        }else if(nota >= 50 && nota <= 69){

            System.out.println("REGULAR");
        }else if(nota == 0 && nota <= 49){
            
            System.out.println("REPROBADO");
        }

        
    }
}
