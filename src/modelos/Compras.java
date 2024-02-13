package modelos;

public class Compras {
    private String nomeProduto;
    private double precoProduto;

    public Compras(String nomeProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public String toString() {
        return "Compras: " +
                " produto: '" + nomeProduto + '\'' +
                ", preco: " + precoProduto;
    }
}
