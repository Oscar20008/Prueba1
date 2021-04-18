/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1triangulos;

import java.util.Scanner;

/**
 *
 * @author Leonel Segura
 */
public class Ejercicio1Triangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Triangulo = new Scanner(System.in);
       int Lado1,Lado2,Lado3;
        System.out.println("Ingresa el lado 1 del triangulo");
        Lado1=Triangulo.nextInt();
        System.out.println("Ingresa el lado 2 del triangulo");
        Lado2=Triangulo.nextInt();
        System.out.println("Ingresa el lado 2 del triangulo");
        Lado3=Triangulo.nextInt();
        
        if (Lado1 == Lado2 && Lado3==Lado2 && Lado3==Lado1 ) {
                System.out.println("Triangulo Equilatero");               

        }else if (Lado1==Lado2 || Lado2==Lado3 || Lado3==Lado1){
            System.out.println("Triangulo Isosceles");
        }
        else{
            System.out.println("Triangulo escaleno");
        }
        // este es un comentario de prueba
    }   
}
