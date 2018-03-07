/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO1;

import java.util.Scanner;

/**
 *
 * @author vinicius.presoto
 */
public class main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String escolha;
        int escolhaNum;
        boolean isNumber;
        boolean sair = false;
        
        //Preencher dados do veiculo
        carros novo = new carros();
       
        
        novo.setAno(1900);
        novo.setMarca("lala");
        novo.setModelo("aero");

        System.out.println("");

        do {

            System.out.println("===  Menu  ===\n");

            System.out.printf("1 - Entrar com os dados do veículo no ínicio da lista;"
                    + "\n2 - Entrar com os dados do carro no final da lista;"
                    + "\n3 - Pesquisar se o carro está na lista, pelo modelo, e se estiver mostrar os outros dados;"
                    + "\n4 - impirmir todos os elementos da lista;"
                    + "\n5 - Remover um elemento da lista, escolhido pelo modelo;"
                    + "\n6 - Remover todos os elementos da lista. Neste caso vocês terão que criar o método;");

            escolha = ler.nextLine();

            isNumber = escolha.matches("\\d+");

            if (isNumber) {
                escolhaNum = Integer.parseInt(escolha);
                escolhaNum = Opcoes(escolhaNum);
                if (escolhaNum == 0) {
                    sair = true;
                }
            } else {
                System.err.println("Escolha um dos números acima.");
                escolhaNum = 99;
                sair = false;
            }

        } while (sair == false);
    }

    static int Opcoes(int escolhaNum) {
        switch (escolhaNum) {
            case 1:
                //Entrar com os dados do veículo no ínicio da lista

                break;
            case 2:
                //Entrar com os dados do carro no final da lista

                break;
            case 3:
                //Pesquisar se o carro está na lista, pelo modelo, e se estiver mostrar os outros dados

                break;
            case 4:
                //Impirmir todos os elementos da lista

                break;
            case 5:
                //Remover um elemento da lista, escolhido pelo modelo

                break;
            case 6:
                //Remover todos os elementos da lista. Neste caso vocês terão que criar o método

                break;

            case 0:

                System.out.println("Programa finalizado.");
                break;
            default:

                System.err.println("Erro\nEscolha uma das opções acima.");
                escolhaNum = 99;
                break;
        }

        return escolhaNum;
    }

}
