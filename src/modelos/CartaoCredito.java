package modelos;

public class CartaoCredito {
    private double limiteCartao;

    public CartaoCredito(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }
}
