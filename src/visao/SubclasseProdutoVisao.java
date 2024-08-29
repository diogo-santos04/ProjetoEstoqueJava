package visao;

import dominio.SubclasseProduto;
import java.time.LocalDate;


public class SubclasseProdutoVisao {
    public SubclasseProdutoVisao(){
    }

    public void exibir(){
        SubclasseProduto scp1 = new SubclasseProduto(1, "Refrigerantes", LocalDate.now(), 1);

        System.out.println("Classe de Produto");
        System.out.println("Código: " + scp1.getCodigo());
        System.out.println("Descrição: " + scp1.getDescricao()); 
        System.out.println("Data de Inclusão: " + scp1.getDataDeInclusao());

        SubclasseProduto scp2 = new SubclasseProduto(2, "Sucos", LocalDate.now(), 1);

        System.out.println("Classe de Produto");
        System.out.println("Código: " + scp2.getCodigo());
        System.out.println("Descrição: " + scp2.getDescricao()); 
        System.out.println("Data de Inclusão: " + scp2.getDataDeInclusao());

        SubclasseProduto scp3 = new SubclasseProduto(3, "Destilados", LocalDate.now(), 1);

        System.out.println("Classe de Produto");
        System.out.println("Código: " + scp3.getCodigo());
        System.out.println("Descrição: " + scp3.getDescricao()); 
        System.out.println("Data de Inclusão: " + scp3.getDataDeInclusao());
    }
}
