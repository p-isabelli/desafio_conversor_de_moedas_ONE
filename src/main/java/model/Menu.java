package model;

public class Menu {

    private String moedaBase;
    private String moedaNova;

    public String getMoedaBase() {
        return moedaBase;
    }

    public String getMoedaNova() {
        return moedaNova;
    }

    public String exibeMenu(){
        return "---------Bem vindo ao Conversor de Moedas :)\n" +
                "Converter de \n" +
                "1 - Real Brasileiro para Dólar Americado\n" +
                "2 - Dolar Americano para Real Brasileiro\n" +
                "3 - Peso Argentino para Real Brasileiro\n" +
                "4 - Real Brasileiro para Peso Argentino\n" +
                "5 - Peso Mexicano para Real Brasileiro\n" +
                "6 - Real Brasileiro para Peso Mexicano\n" +
                "7 - Sair";
    }

    public void menuOpcao(int opcao){
        switch (opcao){
            case 1:
                moedaBase = "BRL";
                moedaNova = "USD";
                break;
            case 2:
                moedaBase = "USD";
                moedaNova = "BRL";
                break;
            case 3:
                moedaBase = "ARS";
                moedaNova = "BRL";
                break;
            case 4:
                moedaBase = "BRL";
                moedaNova = "ARS";
                break;
            case 5:
                moedaBase = "MXN";
                moedaNova = "BRL";
                break;
            case 6:
                moedaBase = "BRL";
                moedaNova = "MXN";
                break;
            default:
                System.out.println("Opção inválida!");


        }
    }
}
