/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ConverterTermperaturasExercicioAulaOnLine;
import java.util.Scanner;
/**
 *
 * @author Gustavo F. Vetter 04/11/21
 */
public class Main {

    /**
     Programa para o usuário ver conversao de temperaturas (C -> F ou F -> C).
     Usuário vai ver uma escala de 1 a 100, da temperatura escolhida.
     */
    public static void main(String[] args) {
        
        int i = 0;
        int opcaoMenu = 0;
        double valorEmCelsius;
        double valorEmFarenheit;
                
        Scanner leitor = new Scanner(System.in);
        
        while(opcaoMenu != 3){

        // Menu com a opções para o usuário:
        System.out.println(" ");
        System.out.println("Escolha uma das opcoes abaixo:");
        System.out.println("1 - Converter Celsius para Farenheit");
        System.out.println("2 - Converter Farentheit para Celsius");
        System.out.println("3 - Encerrar o programa.");
        System.out.println(" ");
        opcaoMenu = leitor.nextInt();
        System.out.println(" ");
        
        
        switch(opcaoMenu){
            case 1: // Opcao escolhida: Converter Celsius para Farenheit
                System.out.println("Opcao escolhida: Converter Celsius para"
                        + " Farenheit");
                System.out.println(" ");
                i = 0;
                valorEmCelsius = 0;
                for (; i < 101; i++){
                valorEmFarenheit = (valorEmCelsius * 1.8) + 32;
                System.out.println(i + " Graus Celsius equivale(m) a " + 
                        valorEmFarenheit + " Graus Farenheit");
                valorEmCelsius = valorEmCelsius + 1;
                }
                break;
        
            case 2: // Opcao escolhida: Converter Farenheit para Celsius
                System.out.println("Opcao escolhida: Converter Farenheit para "
                        + "Celsius");
                System.out.println(" ");
                i = 0;
                valorEmFarenheit = 0;
                for (; i < 101; i++){
                valorEmCelsius = (valorEmFarenheit - 32) / 1.8;
                System.out.println(i + " Graus Farenheit equivale(m) a " + 
                        valorEmCelsius + " Graus Celsius");
                valorEmFarenheit = valorEmFarenheit + 1;
                }
                break;
            default: // Caso opção seja diferente de 3
                if (opcaoMenu != 3){
                    System.out.println(" ");
                    System.out.println("Opcao invalida. Digite 1, 2 ou 3. ");
                    System.out.println(" ");
                                    }
    }
        // Caso usuário digite 3 --> encerrar o programa
        if (opcaoMenu == 3){
        System.out.println(" ");
        System.out.println("Obrigado por utilizar nosso sistema de conversao"
                + " de temperaturas. Ate a proxima.");
        System.out.println(" ");
        }
}
}
}
