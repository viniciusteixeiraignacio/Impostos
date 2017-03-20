package br.com.satc;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        float valpro = entrada.nextFloat();
        System.out.println("Digite se o produto é nacional ou importado: ");
        String nacional = entrada.next();
        String importado = entrada.next();
        float valt = (float) (valpro * 0.1);
        float valt15 = (float) (valpro * 0.15);
        float valt50 = (float) (valpro * 0.50);
        if (nacional.toUpperCase().equals("NACIONAL")) {
            if (valpro <= 999) {
                System.out.println("O valor do produto é " + valpro + "\n"
                        + "o valor pago de impostos será de " + valt + " .");
            } else if (valpro >= 1000) {
                System.out.println("O valor do poduto é " + valpro);
                System.out.println("O valor pago de impostos será de " + valt15);
            } else {
                if (importado.toUpperCase().equals("IMPORTADO")) {
                    System.out.println("O valor do produto é" + valpro);
                System.out.println("Ovalor pago de impostos será de " + valt50);
                }

            }
        }
    }
}