package visao;
import dominio.Produto;
import java.time.LocalDate;

public class ProdutoVisao {
    public ProdutoVisao(){
    }

    public void exibir(){
        Produto p1 = new Produto(1, "Guarana", LocalDate.now(), 1, 10.00);

        System.out.println("Classe de Produto");
        System.out.println("Código: " + p1.getCodigo());
        System.out.println("Descrição: " + p1.getDescricao()); 
        System.out.println("Data de Inclusão: " + p1.getDataDeInclusao());
        System.out.println("Valor: " + p1.getValor());

        Produto p2 = new Produto(2, "Uva", LocalDate.now(), 2, 5.00);

        System.out.println("Classe de Produto");
        System.out.println("Código: " + p2.getCodigo());
        System.out.println("Descrição: " + p2.getDescricao()); 
        System.out.println("Data de Inclusão: " + p2.getDataDeInclusao());
        System.out.println("Valor: " + p2.getValor());

        Produto p3 = new Produto(2, "Whisky", LocalDate.now(), 2, 20.00);

        System.out.println("Classe de Produto");
        System.out.println("Código: " + p3.getCodigo());
        System.out.println("Descrição: " + p3.getDescricao()); 
        System.out.println("Data de Inclusão: " + p3.getDataDeInclusao());
        System.out.println("Valor: " + p3.getValor());
    }
}
