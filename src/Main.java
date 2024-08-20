import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    String nomeProd = "vassora";
    double precoProduto = 30;
    int produtosComprados = 17;
    double imposto = 1.10;
    double lucro = 1.35;


    double valorSemImposto = precoProduto * produtosComprados;
    double valorComImposto = valorSemImposto * imposto;
    double unidadeComImposto = valorComImposto/produtosComprados;
    double valorFinal = unidadeComImposto * lucro;

    System.out.println("Nome do produto: " + nomeProd);
    System.out.println("Valor do produto: " + precoProduto);
    System.out.println("Produtos coprados: " + produtosComprados);
    System.out.println("Valor Total sem Imposto: " + valorSemImposto);
    System.out.println("Valor Total com Imposto: " + valorComImposto);
    System.out.println("Valor unitario com Imposto: " + unidadeComImposto);
    System.out.println("Valor final para venda: " + valorFinal);















    }
}