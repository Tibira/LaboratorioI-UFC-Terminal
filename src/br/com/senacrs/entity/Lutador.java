/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.senacrs.entity;

/**
 *
 * @author Angelo2
 */
public final class Lutador {
    private String nome;
    private String categoria;
    private double  peso;
    private double force;
    private double energia;
    private final int defesa;
    
    public Lutador(String nome, String categoria, double peso, double force, int resistencia){
        setNome(nome);
        setCategoria(categoria);
        setPeso(peso);
        setForce(force);
        setEnergia(100);
        this.defesa = validaResistencia(resistencia);
    }

  
    
    private int validaResistencia(int resistencia){
        return  (resistencia>0 && resistencia <=100? resistencia:0);
    }
    public int getResistencia(){
        return defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getForce() {
        return force;
    }

    public void setForce(double force) {
        this.force = (force>0 && force <=100? force:-1);
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    @Override
    public String toString() {
        return "Lutador{" + "nome=" + nome + ", categoria=" + categoria + ", peso=" + peso + ", force=" + force + ", energia=" + energia + ", resistencia=" + defesa + '}';
    }
    
}
