/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class AlumnoEdadComparator implements Comparator<Alumno> {

    @Override
    // return -1 si o1 < o2, 0 si o1 = o2 y +1 si o1 > 02
    public int compare(Alumno t, Alumno t1) {
        if (t.getEdad() < t1.getEdad()) {
            return -1;
        } else if (t.getEdad() == t1.getEdad()) {
            return 0;
        } else {
            return 1;
        }
    }
}

class EstudianteNotaComparator implements Comparator<Estudiante> {

    @Override
    public int compare(Estudiante t, Estudiante t1) {
        if (t.getNota() < t1.getNota()) {
            return -1;
        } else if (t.getNota() == t1.getNota()) {
            return 0;
        } else {
            return 1;
        }
    }
}

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
        
        List<Estudiante> listaEstudiante = new ArrayList<>();
        
        listaEstudiante.add(new Estudiante("David", 7.8));
        listaEstudiante.add(new Estudiante("Eloi", 5.6));
        listaEstudiante.add(new Estudiante("Gerard", 9.5));
        listaEstudiante.add(new Estudiante("Marc", 6.5));
        listaEstudiante.add(new Estudiante("Arnau", 8.0));
        
        Collections.sort(listaEstudiante);
        System.out.println(listaEstudiante);
        
        Collections.sort(listaEstudiante, new EstudianteNotaComparator());
        System.out.println(listaEstudiante);
        

        /*List<Alumno> list = new ArrayList<>();
        list.add(new Alumno("pepe", 20));
        list.add(new Alumno("david", 19));
        list.add(new Alumno("marc", 17));
        list.add(new Alumno("arnau", 30));

        Collections.sort(list, new AlumnoEdadComparator());
        System.out.println(list);*/

 /*List<String> listS = new ArrayList<>();

        listS.add("Madrid");
        listS.add("Barcelona");
        listS.add("Sevilla");
        listS.add("Malaga");
        
        Collections.reverse(listS);
        Collections.shuffle(listS);
        
        System.out.println(listS);
        
        List<Alumno> list = new ArrayList();
        
        list.add(new Alumno("David", 10));
        list.add(new Alumno("Eloi", 11));
        list.add(new Alumno("Gerard", 12));
        
        Collections.sort(list);
        
        System.out.println(list);
        
        
        /*Set <Alumno> set = new HashSet<>();
        set.add(new Alumno("David", 19));
        set.add(new Alumno("Guillem", 20));
        set.add(new Alumno("Eloi", 20));
        set.add(new Alumno("Eloi", 19));
        
        for (Iterator it = set.iterator(); it.hasNext(); ) {
			System.out.println(it.next());
        }*/

 /*Map<Integer, Alumno> map = new HashMap<>();

        map.put(1, new Alumno("Pepe", 34));
        map.put(1, new Alumno("Jose", 44));
        map.put(2, new Alumno("David", 40));
        map.put(3, new Alumno("David", 20));

        Alumno a = map.get(3);

        System.out.println(a);

        Set<Integer> claves = map.keySet();

        for (Iterator it = claves.iterator(); it.hasNext();) {
            System.out.println(map.get(it.next()));
        }

        Collection<Alumno> col = map.values();

        for (Iterator it = col.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }*/
        //ultimoDeLaLista
        /*List<Integer> listaT = new ArrayList<>();

        listaT.add(1);
        listaT.add(2);
        listaT.add(3);
        listaT.add(4);
        
        int objeto = ultimoDeLaLista(listaT);
        System.out.println(objeto);

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
