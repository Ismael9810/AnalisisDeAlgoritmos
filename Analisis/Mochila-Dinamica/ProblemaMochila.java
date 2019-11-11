/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ismael Cortes
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;


public class ProblemaMochila {
    ArrayList<Elemento> almacen = new ArrayList<Elemento>();
    Vector<Elemento> mochila = new Vector<Elemento>();
    final double  pesoMaximo;

    public ProblemaMochila(int pm) {
        pesoMaximo = pm;
        cargarDatos();
    }

    public void cargarDatos() {
        Tokenizador.leerDatos();
        almacen=Tokenizador.articulos;
   }


     public void mostrarMochila() {
        double pesoMochila=0;
        double valorMochila=0;
        for(Elemento e: mochila) {
            //System.out.println(e.peso+" |"+e.valor);
            pesoMochila+=e.peso;
            valorMochila+=e.valor;
        }
        System.out.println("------");
        System.out.println("Peso  Maximo= "+pesoMochila);
        System.out.println("Valor Maximo= "+ valorMochila);
    }
     public void resolverProblema() {
        // Comparador para ordenar los elementos del almacen por valor
        Comparator cmp = new Comparator<Elemento>() {
            public int compare(Elemento x, Elemento y) {
                System.out.println(x.valor+" "+y.valor);
                return (int) (x.valor - y.valor);
            }
        };
        Collections.sort(almacen,cmp);  // ordena usando el comparador anterior
       
        Collections.reverse(almacen);   // reversa el orden de los elementos
    System.out.println("");
        double pesoMochila=0;
        int    posicion=0;
        while(pesoMochila<pesoMaximo && posicion < almacen.size()) {
            Elemento tmp = almacen.get(posicion);
            if(pesoMochila + tmp.peso <= pesoMaximo) {
                mochila.add(tmp);
                pesoMochila+=tmp.peso;
            }
            posicion++;
          
        }
    }

}
