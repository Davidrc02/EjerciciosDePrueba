package Ciclos;
import java.util.Scanner;
public class Ejercicio13 {

/*
Pedir 10 números. Mostrar la media de los números positivos,
la media de los números negativos y la cantidad de ceros.
*/
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num, suma_pos=0,suma_neg=0, cont_pos=0, cont_neg=0, cont=0;
        float media_neg, media_pos;
        for (int i = 1; i <= 10; i++){
        System.out.println("Introduzca un número");
        num=entrada.nextInt();
        if(num==0){
            cont++; 
        }
            else if(num>0){
                suma_pos+= num;
                cont_pos++;
            }
            else if(num<0){
                suma_neg+= num;
                cont_neg++;
            }
        }
        if(cont_pos==0){
            System.out.println("No se puede sacar media de positivos");
        }
        else{
        media_pos = (float) suma_pos/cont_pos;
        System.out.println("La media de los numeros positivos es "+ media_pos);
        }
        
        if (cont_neg==0) {
            System.out.println("No se puede sacar media de negativos");
        }
        else{
            media_neg= (float) suma_neg/cont_neg;
            System.out.println("La media de los negativos es "+ media_neg);
        }
        System.out.println("La cantidad de ceros es "+ cont);        
    }  
}
