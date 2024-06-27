package model;

import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        BuscaMoeda moeda = new BuscaMoeda();

        double taxaConversao = 0;
        int opcaoMenu = 0;
        double valor = 0;

        while(opcaoMenu != 7){
            System.out.println(menu.exibeMenu());
            opcaoMenu = scanner.nextInt();

            if(opcaoMenu == 7){
                break;
            }
            try {
                menu.menuOpcao(opcaoMenu);
                taxaConversao = moeda.buscaMoeda(moeda.endereco(menu.getMoedaBase(), menu.getMoedaNova()));
                System.out.println("Digite o valor que deseja converter: ");
                valor = scanner.nextDouble();
                System.out.println("O valor de " + valor + " [" + menu.getMoedaBase() + "] corresponde ao valor de " + valor * taxaConversao + " [" + menu.getMoedaNova() + "]");
                System.out.println();
            } catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Aplicação encerrada!");
                break;
            }
        }
    }
}
