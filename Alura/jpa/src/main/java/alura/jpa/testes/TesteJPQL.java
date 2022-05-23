package alura.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import javax.persistence.Query;
import javax.persistence.TypedQuery;

import alura.jpa.modelo.Conta;
import alura.jpa.modelo.Movimentacao;

public class TesteJPQL 
{
    public static void main(String[] args) 
    {
        //String query = "SELECT * FROM movimentacao WHERE conta_id = 2;"; //SQL
        //String jpql = "SELECT m FROM Movimentacao m WHERE m.conta.id = 2"; //JPQL

        Conta conta = new Conta();
        conta.setId(2L);
        String jpql = "SELECT m FROM Movimentacao m WHERE m.conta = :pConta ORDER BY m.valor DESC"; //JPQL //:p é para indicar que é um parâmetro

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Movimentacao> query = em.createQuery(jpql, Movimentacao.class); // Query query
        query.setParameter("pConta", conta);
        List<Movimentacao> resultList = query.getResultList();

        for (Movimentacao movimentacao : resultList) {
            System.out.println("Descrição: " + movimentacao.getDescricao());
            System.out.println("Tipo: " + movimentacao.getTipoMovimentacao());
            System.out.println("Valor: " + movimentacao.getValor());
        }
    }
}
