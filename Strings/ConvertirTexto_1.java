/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class ConvertirTexto_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1) Introduce un texto por teclado. Muestralo en minúscula, mayúscula y dí cuantos carácteres tiene.

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un texto :");
        String texto = scan.nextLine().toLowerCase();
        System.out.println("Minúscula: "+texto);
        System.out.println("Mayúsculas: "+texto.toUpperCase());
        System.out.println("El texto tiene : "+texto.length()+" carácteres");

    }
    
}
