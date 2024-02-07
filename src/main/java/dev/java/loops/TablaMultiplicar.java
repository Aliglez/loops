package dev.java.loops;


import java.util.*;

public class TablaMultiplicar {
    public static void main(String[] args) {
        
        int n;
        System.out.println("¿Qué tabla desea realizar?");
        try (Scanner valor1 = new Scanner(System.in)) {
            n = valor1.nextInt();
        }
        System.out.print("Tabla del " + n);
        System.out.println();
        for(int i=1; i<=10; i++){
            
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
