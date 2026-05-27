package com.guild;

import java.util.HashMap;
import com.google.gson.Gson;

public class PersonagemDAO {

    private int proximoId = 1;

    HashMap<Integer, Personagem> cofre = new HashMap<>();
    



    public void importarPersonagemDoServidor(String json) {
        Gson gson = new Gson();

        Personagem personagem = gson.fromJson(json, Personagem.class);

        cofre.put(proximoId, personagem);

        proximoId++;

    }

    public void createPersonagem(String nome, String classe, int nivel) {

        Personagem novoPersonagem = new Personagem(nome, classe, nivel);

        cofre.put(proximoId, novoPersonagem);

        proximoId++;

    }

    public HashMap<Integer, Personagem> exibirPersonagens() {
        return this.cofre;
    }

    public void atualizarNivel(int id, int novoNivel) {

        Personagem personagem = cofre.get(id);

        personagem.setNivel(novoNivel);

        cofre.put(id, personagem);



    }

    public void excluirPeronagem(int id) {

        cofre.remove(id);


    }

    

}
