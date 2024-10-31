package lacos_repeticao;

import java.util.Arrays;
import java.util.Collections;

public class teste {

    public static void main(String[] args) {

        String array_nomes[] = {"Bia", "Patty", "Dé", "Nicky"};

        Arrays.sort(array_nomes);

        System.out.println("Array em ordem alfabética");

        for (int i = 0; i < array_nomes.length; i++) {
            System.out.println(array_nomes[i]);
        }

        Arrays.sort(array_nomes, Collections.reverseOrder());

        System.out.println("\nArrays em ordem decrescente: ");
        for (int i = 0; i < array_nomes.length; i++) {
            System.out.println(array_nomes[i]);
        }
    }
}