package menu;

import modelos.CartaoCredito;

import java.util.Scanner;

public class MenuPrincipal {
    CartaoCredito meuCartao = new CartaoCredito(0);

    public int opcaoEscolhida = 0;

    public void funcionamentoMenu(){
        while (opcaoEscolhida < 2){
        escolherOpcoes(pedirOpcao());
        }
    }
    private int pedirOpcao(){
        mostrarOpcoes();
        Scanner scanner = new Scanner(System.in);
        opcaoEscolhida = scanner.nextInt();
        return opcaoEscolhida;
    }
    private void pedirLimiteCartao(){
        System.out.println("Informe o limite do seu cartao: ");
    }

    public void definirLimite(){
        Scanner scanner = new Scanner(System.in);
        pedirLimiteCartao();
        meuCartao.setLimiteCartao(scanner.nextDouble());

    }
    public void mostrarLimite(){
        System.out.println(meuCartao.getLimiteCartao());
    }
    private void mostrarOpcoes(){
        System.out.println("Digite 0 para visualizar o limite do seu cartao. ");
        System.out.println("Digite 1 para definir o limite do seu cartao. ");
        System.out.println("Digite 2 para sair. ");
    }
    public void escolherOpcoes(int opcaoEscolhida){
        if (opcaoEscolhida == 0) {
            mostrarLimite();
        } else if (opcaoEscolhida == 1){
            definirLimite();
        }
    }
}
