package alura.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import alura.jpa.modelo.Categoria;
import alura.jpa.modelo.Movimentacao;

public class TesteJPQLMoviCate 
{
    public static void main(String[] args) 
    {
        Categoria categoria = new Categoria();
        categoria.setId(2L);
        String jpql = "SELECT m FROM Movimentacao m JOIN m.categoria c WHERE c = :pCategoria"; //JPQL //:p é para indicar que é um parâmetro

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Movimentacao> query = em.createQuery(jpql, Movimentacao.class); // Query query
        query.setParameter("pCategoria", categoria);
        List<Movimentacao> resultList = query.getResultList();

        for (Movimentacao movimentacao : resultList) {
            System.out.println("Categorias: " + movimentacao.getCategoria());
            System.out.println("Tipo: " + movimentacao.getTipoMovimentacao());
            System.out.println("Valor: " + movimentacao.getValor());
        }
    }
}
