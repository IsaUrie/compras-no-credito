import menu.MenuPrincipal;
import modelos.Transacoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Transacoes minhaTransacao = new Transacoes();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i != 2){
            if (i == 0){
                minhaTransacao.definfirLimite();
                minhaTransacao.cadastrarCompra();
                minhaTransacao.adicionarCompra();
                minhaTransacao.atualizarLimite();
                minhaTransacao.exibirSaldo();
                System.out.println("Deseja fazer uma nova transacao?");
                System.out.println("1 - Sim");
                System.out.println("2 - Nao");
                System.out.println("3 - Visualizar extrato de compras");
            } else if (i == 1){
                minhaTransacao.cadastrarCompra();
                minhaTransacao.adicionarCompra();
                minhaTransacao.atualizarLimite();
                minhaTransacao.exibirSaldo();
                System.out.println("Deseja fazer uma nova transacao?");
                System.out.println("1 - Sim");
                System.out.println("2 - Nao");
                System.out.println("3 - Visualizar extrato de compras");

            } else if (i == 3) {
                minhaTransacao.exibirExtrato();
                System.out.println("Deseja fazer uma nova transacao?");
                System.out.println("1 - Sim");
                System.out.println("2 - Nao");
            }

            i = scanner.nextInt();
        }
    }

}