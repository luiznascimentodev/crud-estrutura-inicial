package com.guild;

import java.util.HashMap;
import java.util.Scanner;

public class AdminView {

    public void iniciarMenu() {
        int opcao = 0;

        Scanner scanner = new Scanner(System.in);

        PersonagemDAO personagem = new PersonagemDAO();

        while (opcao != 6) {

            System.out.println("Escolha uma opcao no menu");
            System.out.println("1. Criar Personagem");
            System.out.println("2. Listar Personagens");
            System.out.println("3. Atualizar Nivel");
            System.out.println("4. Excluir Personagem");
            System.out.println("5. Importar VIP");
            System.out.println("6. Sair");

            try {
                opcao = Integer.parseInt(scanner.nextLine());


                switch (opcao) {
                    case 1:

                        System.out.println("Digite o nome do Personagem:");
                        String nomePersonagem = scanner.nextLine();

                        if (!nomePersonagem.matches("^[a-zA-ZÀ-ÿ\\s]+$")) {
                           
                            throw new IllegalArgumentException("O nome deve conter apenas letras!");
                        }



                        System.out.println("Digite a Classe");
                        String classePersonagem = scanner.nextLine();

                        if (!classePersonagem.matches("^[a-zA-ZÀ-ÿ\\s]+$")) {
                            throw new IllegalArgumentException(
                                    "A classe deve conter apenas letras!");
                        }


                        System.out.println("Digite o Nivel");
                        int nivelPersonagem = Integer.parseInt(scanner.nextLine());

                        personagem.createPersonagem(nomePersonagem, classePersonagem,
                                nivelPersonagem);

                        break;

                    case 2:

                        HashMap<Integer, Personagem> listaDaTela = personagem.exibirPersonagens();

                        if (listaDaTela.isEmpty()) {
                            System.out.println("A guilda está vazia!");
                        } else {

                            for (Personagem personagens : listaDaTela.values()) {
                                System.out.println(personagens);
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Digite o id do Personagem");
                        int id = Integer.parseInt(scanner.nextLine());

                        System.out.println("Digite o novo Nivel");
                        int novoNivel = Integer.parseInt(scanner.nextLine());

                        personagem.atualizarNivel(id, novoNivel);
                        break;
                    case 4:

                        System.out.println("Digite o id do Personagem que deseja excluir");
                        id = Integer.parseInt(scanner.nextLine());

                        personagem.excluirPeronagem(id);

                        break;

                    case 5:
                        String vip = "{'nome':'Sniper','classe':'Arqueiro','nivel':99}";

                        personagem.importarPersonagemDoServidor(vip);

                        System.out.println("Personagem VIP decodificado e importado com sucesso!");

                        break;


                    default:
                        System.out.println("Opcao invalida!");





                }



            } catch (IllegalArgumentException e) {

                System.out.println("Erro de validação: " + e.getMessage());
            } catch (Exception e) {

                System.out.println("Erro: Entrada inválida. Por favor, tente novamente.");
            }


        }
        scanner.close();



    }
}
