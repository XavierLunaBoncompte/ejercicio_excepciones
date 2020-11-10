/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics.collections.excercici;

import java.util.List;

/**
 *
 * @author lubo1
 */
public interface Matcher {
    Persona matches(Persona persona, List<Persona> candidatos);
    
}
