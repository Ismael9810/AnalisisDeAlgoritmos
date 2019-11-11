/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ismael Cortes
 */
public class TestMochila {

    public static void main(String[] args) {
        // Crear una mochila que soporta hasta 5 Kg. de peso
        ProblemaMochila pm = new ProblemaMochila(500);
        pm.resolverProblema();
        pm.mostrarMochila();
        System.out.println("");
    }

}
