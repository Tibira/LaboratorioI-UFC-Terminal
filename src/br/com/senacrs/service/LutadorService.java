/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.service;

import br.com.senacrs.entity.Lutador;
import java.util.Random;

/**
 *
 * @author Angelo2
 */
public class LutadorService {

    private Lutador l;

    public LutadorService(Lutador l) {
        this.l = l;
    }

    public String darSoco(LutadorService l2) {
        l.setEnergia(l.getEnergia() - 0.4);
        return l2.receberSoco(l.getEnergia() * l.getForce());
    }

    public String receberSoco(double force) {
        String msg = "dodge";
        if (dodge()) {
            l.setEnergia(l.getEnergia() - ((((200 - l.getResistencia()) + (force * 0.005)) - l.getEnergia()) * 0.2));
            msg = "hit";

        }
        return msg;
    }

    public boolean isFighting() {
        return (l.getEnergia() > 0);
    }

    public boolean dodge() {
        Random hit = new Random();
        return (hit.nextInt((int) l.getEnergia()) <= 30);
    }

    public Lutador getLutador() {
        return l;
    }
}
