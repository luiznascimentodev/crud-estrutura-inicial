package com.guild;

public class Personagem {
    private String nome;
    private String classe;
    private int nivel;


    public String getNome(){
        return this.nome;
    }

    public String getClasse() {
        return this.classe;

    }
    
    public int getNivel(){
        return this.nivel;
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setNivel(int nivel) {
        
        if (nivel < 1 || nivel > 100) {
            throw new IllegalArgumentException("Nível inválido!");
        } 
        
        this.nivel = nivel;
        
    }


    public Personagem () {
        
    }

    public Personagem(String nome, String classe, int nivel) {
        this.setNome(nome);
        this.setClasse(classe);
        this.setNivel(nivel);
    }

    @Override
    public String toString() {
        return "Personagem : " + nome + " Classe: " + classe + " Nivel: " + nivel;
    }
}
