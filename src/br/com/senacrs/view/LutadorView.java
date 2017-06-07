/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.view;

import br.com.senacrs.entity.Lutador;
import static utilidades.Teclado.*;
import br.com.senacrs.service.LutadorService;

/**
 *
 * @author Angelo2
 */
public final class LutadorView {

    private LutadorService ls;

    public LutadorView() {
        init();
    }

    public void init() {
        String nome = leString("Nome do Lutador:");
        String categoria = leString("Categoria: ");
        double peso = leDouble("Peso: ");
        double force = leDouble("Força(0-100):");
        int resistencia = leInt("Resistência (0-100): ");
        ls = new LutadorService(new Lutador(nome, categoria, peso, force, resistencia));
    }

    public LutadorService getLs() {
        return ls;
    }

    


}
