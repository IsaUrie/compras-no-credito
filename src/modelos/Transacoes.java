package modelos;

import java.util.Scanner;

public class Transacoes {
    public CartaoCredito meuCartao = new CartaoCredito(0);
    public Compras minhaCompra = new Compras("produto", 0);
    Scanner scanner = new Scanner(System.in);

    public void definfirLimite(){
        System.out.println("Digite o seu limite: ");
        meuCartao.setLimite(scanner.nextDouble());
    }
    public void exibirSaldo(){
        System.out.println(meuCartao.getSaldo());
    }
    public Compras cadastrarCompra(){
        System.out.println("Digite o nome do produto: ");
        minhaCompra.setNomeProduto(scanner.next());
        System.out.println("Digite o valor do produto: ");
        minhaCompra.setPrecoProduto(scanner.nextDouble());
        meuCartao.getCompras().add(minhaCompra);
        return minhaCompra;
    }
    public Boolean validarSaldoDisponivel(){
        if (minhaCompra.getPrecoProduto() <= meuCartao.getLimite()){
           return true;
        } else{
            return false;
        }
    }
    public void atualizarLimite(){
        if (validarSaldoDisponivel()){
            System.out.println(meuCartao.getLimite());
            meuCartao.setLimite(meuCartao.getLimite()-minhaCompra.getPrecoProduto());
        } else{
            System.out.println("limite nao disponivel");
        }
    }
    public void adicionarCompra(){
        meuCartao.getCompras().add(minhaCompra);
    }

    public void exibirExtrato(){
        for (Compras compras : meuCartao.getCompras()){
            System.out.println(compras);
        }
    }
}
