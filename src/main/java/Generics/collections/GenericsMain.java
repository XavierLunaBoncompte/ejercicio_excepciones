/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author lubo1
 */
public class GenericsMain<T> {

    /**
     * Metodos estaticos Escribe un metoodo que retorne el ultimo elemento de
     * una lista. Usar generico
     *
     * Escribe un metodo que retorne la media de una lista de Double
     *
     * Escribe un metodo que retorne la cadena mas larga de una lista de
     * cadenas.
     *
     * Escribe un metodo que retone el maximo de una lista de enteros
     */
    public static <T> T ultimoDeLaLista(List<T> listaT) {

        return listaT.get(listaT.size() - 1);
    }

    public static double mediaDeUnaLista(List<Double> listaD) {
        double m = 0.0;

        for (int i = 0; i < listaD.size(); i++) {
            m = m + listaD.get(i);
        }

        double mediaT = m / listaD.size();

        return mediaT;

    }

    public static String cadenaMasLargaDeUnaLista(List<String> listaS) {
        String cadenaMasLarga = "";
        for (int i = 1; i < listaS.size(); i++) {
            if (listaS.get(i).length() > cadenaMasLarga.length()) {
                cadenaMasLarga = listaS.get(i);
            }
        }
        return cadenaMasLarga;

    }

    public static int maximoDeUnaListaDeEnteros(List<Integer> listaE) {
        int max = 0;

        for (int i = 0; i < listaE.size(); i++) {
            if (max < listaE.get(i)) {
                max = listaE.get(i);
            }
        }

        return max;

    }

    public static void main(String[] args) {

        //ultimoDeLaLista
        List<Integer> listaT = new ArrayList<>();

        listaT.add(1);
        listaT.add(2);
        
        int objeto = ultimoDeLaLista(listaT);

        //mediaDeUnaLista
        List<Double> listD = new ArrayList<>();

        listD.add(3.2);
        listD.add(5.4);
        listD.add(3.6);
        listD.add(1.0);
        listD.add(9.2);

        double mediaTotal = mediaDeUnaLista(listD);
        System.out.println(mediaTotal);

        //cadenaMasLargaDeUnaLista
        List<String> listS = new ArrayList<>();

        listS.add("Madrid");
        listS.add("Barcelona");
        listS.add("Sevilla");
        listS.add("Malaga");

        String palabra = cadenaMasLargaDeUnaLista(listS);
        System.out.println(palabra);

        //maximoDeUnaListaDeEnteros
        List<Integer> listE = new ArrayList<>();

        listE.add(9);
        listE.add(4);
        listE.add(3);
        listE.add(1);
        listE.add(16);
        
        int maximo = maximoDeUnaListaDeEnteros(listE);
        System.out.println(maximo);

        /*List<String> lista1 = new ArrayList<>();
        lista1.add("Marta");
        lista1.add("Eva");
        lista1.add("Joan");
        lista1.add("Carles");
        lista1.add("Pep");

        if (lista1.isEmpty()) {
            System.out.println("La llista es buida");
        } else {
            System.out.println("La llista te " + lista1.size() + " elements");
        }

        lista1.remove("Carles");
        System.out.println("Carles eliminat de la lista");

        if (lista1.isEmpty()) {
            System.out.println("La llista es buida");
        } else {
            System.out.println("La llista te " + lista1.size() + " elements");
        }

        for (int i = 0; i < lista1.size(); i++) {
            System.out.println(lista1.get(i));
        }
        
        for (Iterator it = lista1.iterator(); it.hasNext(); ) {
			System.out.println(it.next());
        }*/
    }
}
