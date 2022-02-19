package com.mycompany.dni;

import java.util.Scanner;

public class GarciaAlejandroDNI {

    /*1. Almacene en una variable el número de DNI indicado por el usuario y en otra 
    variable la letra del DNI que se ha indicado.
    
    2. En primer lugar se debe comprobar si el número es menor que 0 o mayor que 
    99999999. Si ese es el caso, se muestra un mensaje al usuario indicando que el 
    número proporcionado no es válido.
    
    3. Si el número es válido, se calcula la letra que le corresponde según el método 
    explicado anteriormente. 
    
    4. Una vez calculada la letra, se debe comparar con la letra indicada por el 
    usuario. Si no coinciden, se muestra un mensaje al usuario diciéndole que la letra 
    que ha indicado no es correcta. 
    
    En otro caso, se muestra un mensaje indicando que el número y la letra de DNI 
    son correctos*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int num;//numero del DNI introducido por el usuario
        char letra_user;//letra introducida por el usuario
        char letra_real;//letra resultante de la posicion del array del calculo (num%23)
        boolean letra, letraMayus;

        //pedimos el numero al usuario
        System.out.println("Intoduce el número del DNI:");
        //comprobamos que el usuario ha introducido un número
        if (entrada.hasNextInt()) {
            num = entrada.nextInt();
            //comprobamos que el número introducido por el usuario esta entre el 0 y el 99999999
            if (num >= 00000000 && num <= 99999999) {
                //si es un numero y esta entre dichos valores preguntamos por la letra al usuario
                System.out.println("Introduce la letra del DNI(en mayúsculas):");
                letra_user = entrada.next().charAt(0);
                //comprobamos que el usuario ha introducido una letra
                if (letra = Character.isLetter(letra_user)) {
                    //comprobamos que la letra sea mayúscula
                    if (letraMayus = Character.isUpperCase(letra_user)) {

                        //calculamos la posicion del array, la cual es la letra que corresponde al DNI introducido por el usuario
                        letra_real = letras[num % 23];
                        //comprobamos si la letra introducida por el usuario es igual a la letra que le cooresponde al número
                        if (letra_user == letra_real) {
                            System.out.println("El número y la letra del DNI son correctos");//num y letra correctos
                        } else {
                            System.out.println("El número y la letra del DNI no son correctos");//num y letra incorrectos
                        }
                    } else {
                        System.out.println("La letra debe ser mayúscula");//si el usuario introduce una letra en minuscula

                    }
                } else {
                    System.out.println("Introduce una letra");//si el usuario introduce algo que no es una letra

                }

            } else {
                System.out.println("Número no valido");//el número no esta entre el 0 y el 99999999

            }

        } else {
            System.out.println("No válido");//usuario no introduce un número

        }

    }
}
