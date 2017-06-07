/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.view;

import br.com.senacrs.service.LutadorService;
import java.util.Random;

/**
 *
 * @author Angelo2
 */
public class Luta {

    LutadorService ls1;
    LutadorService ls2;

    public Luta(LutadorView lv1, LutadorView lv2) {
        this.ls1 = lv1.getLs();
        this.ls2 = lv2.getLs();
    }

    /**
     *
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {
        while (ls1.isFighting() && ls2.isFighting()) {
            Random r = new Random();
            if (r.nextInt(2) == 0) {
                System.err.println(ls1.getLutador().getNome() + " Attack: " + ls1.darSoco(ls2));
            } else {
                System.err.println(ls2.getLutador().getNome() + " Attack: " + ls2.darSoco(ls1));
            }
            Thread.sleep(6000);
            System.out.println(ls1.getLutador().getNome() + " : " + ls1.getLutador().getEnergia());
            System.out.println(ls2.getLutador().getNome() + " : " + ls2.getLutador().getEnergia());
            System.out.println(ls1.getLutador().toString());
            System.out.println(ls2.getLutador().toString());
            System.out.println("==========================================");

        }
        if (ls1.isFighting()) {
            System.out.println("WINNNER: " + ls1.getLutador().getNome());
        } else {
            System.out.println("WINNNER: " + ls2.getLutador().getNome());
        }
    }

}
