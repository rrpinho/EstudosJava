package alura.jpa.testes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import alura.jpa.modelo.Conta;
import alura.jpa.modelo.Movimentacao;
import alura.jpa.modelo.TipoMovimentacao;

public class TestaRelacionamentos {
    public static void main(String[] args) 
    {
        Conta conta = new Conta();
        conta.setAgencia(789);
        conta.setNumero(987789);
        conta.setSaldo(300.0);
        conta.setTitular("Jaina");

        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setData(LocalDateTime.now());
        movimentacao.setDescricao("Churrascaria");
        movimentacao.setValor(new BigDecimal(200.0));
        movimentacao.setTipoMovimentacao(TipoMovimentacao.ENTRADA);

        movimentacao.setConta(conta);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(conta);
        em.persist(movimentacao);  
        
        em.getTransaction().commit();
        em.close();
    }
}
