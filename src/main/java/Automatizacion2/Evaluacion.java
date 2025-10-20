package Automatizacion2;

import java.util.Scanner;

public class Evaluacion {
    public static void main(String[] args) {
    Calculadora calculo = new Calculadora();
    Scanner valorConsola = new Scanner(System.in);

        System.out.println("Ingrese un numero: " );
        int a = valorConsola.nextInt();
        System.out.println("Ingrese un numero: " );
        int b = valorConsola.nextInt();
        System.out.println("Ingrese la operacion: '+' '-' '*' '/'");
        char operacion = valorConsola.next().charAt(0);

        switch (operacion){
            case '+':
                System.out.println(calculo.sumar(a, b ));
                break;
            case '-':
                System.out.println(calculo.restar(a, b ));
                break;
            case '*':
                System.out.println(calculo.multiplicar(a, b ));
                break;
            case '/':
                System.out.println(calculo.dividir(a, b ));
                break;
        }
    }
}
