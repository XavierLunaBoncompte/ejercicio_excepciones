/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics.collections.excercici;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class PersonaEdadComparator implements Comparator<Persona> {

    @Override
    public int compare(Persona t, Persona t1) {
        if (t.getEdad() < t1.getEdad()) {
            return -1;
        } else if (t.getEdad() == t1.getEdad()) {
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
public class ExcerciciMain extends MatcherImplementation{

    
    public static void main(String[] args) {
        MatcherImplementation match = new MatcherImplementation();
        //Persona p = new Persona(50, Sexo.HOMBRE, 21, true, OrientacionSexual.HETERO, Formacion.BACHILLARATO, OrientacionPolitica.CENTRO);
        //Persona p = new Persona(51, Sexo.MUJER, 29, false, OrientacionSexual.LESBIANA, Formacion.DOCTORADO, OrientacionPolitica.IZQUIERDA);
        Persona p = new Persona(52, Sexo.MUJER, 42, true, OrientacionSexual.BISEXUAL, Formacion.GRADO, OrientacionPolitica.IZQUIERDA);
        
        List<Persona> listMatcher = new ArrayList<>();
        listMatcher.add( new Persona(01, Sexo.HOMBRE, 33, false, OrientacionSexual.GAY, Formacion.DOCTORADO, OrientacionPolitica.EXTREMA_IZQUIERDA));
        listMatcher.add( new Persona(02, Sexo.MUJER, 32, true, OrientacionSexual.LESBIANA, Formacion.DOCTORADO, OrientacionPolitica.DERECHA));
        listMatcher.add( new Persona(03, Sexo.MUJER, 19, false, OrientacionSexual.LESBIANA, Formacion.GRADO_MEDIO, OrientacionPolitica.IZQUIERDA));
        listMatcher.add( new Persona(04, Sexo.HOMBRE, 27, true, OrientacionSexual.HETERO, Formacion.GRADO, OrientacionPolitica.DERECHA));
        listMatcher.add( new Persona(05, Sexo.MUJER, 20, true, OrientacionSexual.HETERO, Formacion.GRADO_SUPERIOR, OrientacionPolitica.CENTRO));
        listMatcher.add( new Persona(06, Sexo.HOMBRE, 43, false, OrientacionSexual.BISEXUAL, Formacion.CATEDRARTICO, OrientacionPolitica.IZQUIERDA));
        listMatcher.add( new Persona(07, Sexo.MUJER, 38, true, OrientacionSexual.HETERO, Formacion.DOCTORADO, OrientacionPolitica.DERECHA));
        
        Persona personaTrobada = match.matches(p, listMatcher);
        
        System.out.println(personaTrobada);
        
        //listMatcher.add(p);
        
        
    }
    
}
