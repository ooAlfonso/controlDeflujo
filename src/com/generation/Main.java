package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*estructura de control if
        if (condicion) {
        }else if{} {
        }else {
        }
         */

        /*Scanner sc = new Scanner(System.in);
        System.out.println("ingresa tu edad: ");
        int edad = sc.nextInt();
        System.out.println("cual es tu nombre? ");
        sc.nextLine();
        String nombre = sc.nextLine();

        if(edad > 18) {
            System.out.println("felicidades, " + nombre + ", puedes votar");
        } else {
            System.out.println("hola " + nombre + ",aun no puedes votar");
        }
        sc.close();*/
        // solicitar al usuario 3 angulos de un triangulo y determina si el trinanguo es valido
        /*Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el angulo 1: ");
        int angulo1 = sc.nextInt();
        System.out.println("ingresa el angulo 2: ");
        int angulo2 = sc.nextInt();
        System.out.println("ingresa el angulo 3: ");
        int angulo3 = sc.nextInt();
        int resultado = angulo1 + angulo2 + angulo3;

        sc.nextLine();


        if(resultado == 180) {
            System.out.println("felicidades si es un tringulo");
        } else {
            System.out.println("error, los angulos no corresponden a un triangulo");
        }*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el año:");
        int año = sc.nextInt();

        if( año % 4 == 0){
            System.out.println("el año es bsiesto");
        } else {
            System.out.println("el año no es bisiesto");
        }*/
        // contro de flujp switch
        /*
        Scanner sc = new Scanner(System.in);


        System.out.println("ingresa un numero");
        int numero1 = sc.nextInt();
        System.out.println("ingresa otro numero");
        int numero2 = sc.nextInt();
        System.out.println("ingresa la operacion deseada: \n1) suma \n2) resta " + "\n3) multiplicacion \n4) division");
        int operacion = sc.nextInt();
        sc.nextLine();
        float resultado = 0 ;
        switch(operacion)  {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("la operacion que seleccionaste es incorrecta");
                break;
        }
        sc.close();*/

        //// Pedir un número al usuario y dependiendo la respuesta // mostrar un dia de la semana, ejemplo: 1) Domingo, 2) Lunes ... 7)Sabado
        // Si elige un numero fuera de ese rango mostar un mensaje de error;


        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el numero del dia en que se encuestra \n1) lunes \n2) martes \n3) miercoles \n4) jueves \n5)viernes \n6) sabado \n7) domingo");
        int number = sc.nextInt();
        sc.nextLine();

        String day = "semana";

        switch(number) {
            case 1:
                day = "lunes";

                break;
            case 2:
                day = "martes";
                break;
            case 3:
                day = "miercoles";
                break;
            case 4:
                day = "jueves";
                break;
            case 5:
                day = "viernes";
                break;
            case 6:
                day = "sabado";
                break;
            case 7:
                day = "domingo";
            default:
                System.out.println("el numero es incorrecto");
                break;
        }
        System.out.println("el dia es: " + day);
        sc.close();
    }
}
