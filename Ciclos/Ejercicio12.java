package Ciclos;
import java.util.Scanner;
public class Ejercicio12 {

/*
Pedir un número y calcular su factorial    
*/
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num, factorial=1;
        System.out.println("Introduzca un número");
        num=entrada.nextInt();
        for (int i = 1; i <= num; i++) {
            factorial=factorial*i;
        }
        System.out.println("Factorial: "+factorial);
    } 
}
