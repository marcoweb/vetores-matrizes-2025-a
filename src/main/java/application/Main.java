package application;

import java.util.ArrayList;
import java.util.List;

import application.lista.ListaSimples;

public class Main {
    public static void main(String[] args) {
        // Declaração de Vetores
        int[] numeros = new int[5];
        
        // Declaração de Matrizes
        int[][] matriz = new int[5][3];

        // Declaração de Lista Simples
        ListaSimples lista = new ListaSimples();
        lista.adicionar("Primeiro");
        lista.adicionar("Segundo");
        lista.adicionar("Terceiro");
        lista.remover(1);

        List<String> lista2 = new ArrayList<String>();
        lista2.add("Teste");
        

        System.out.println(lista);
    }
}

