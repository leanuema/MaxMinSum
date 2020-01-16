package com.leadro.it;

public class Main {

    public static void main(String[] args) {

        int[] arr;
        arr = new int[]{1, 2, 3, 4, 5};

        int acumulador;
        acumulador = 0;
        int suma;
        suma = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            acumulador = arr[i] + acumulador;
        }
        for (int i = 1; i < arr.length; i++) {
            suma = arr[i] + suma;
        }
        System.out.println(acumulador + "," + suma);

    }

}


