/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.main;

import br.com.senacrs.view.Luta;
import br.com.senacrs.view.LutadorView;

/**
 *
 * @author Angelo2
 */
public class Principal {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Luta luta = new Luta(new LutadorView(), new LutadorView());
        luta.start();

    }

}
