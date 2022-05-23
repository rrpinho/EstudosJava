package alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import alura.jpa.modelo.Conta;

public class AlterandoSaldoConta 
{
    public static void main(String[] args) 
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        Conta contaLeronardo = em.find(Conta.class, 1L);

        em.getTransaction().begin();
        contaLeronardo.setSaldo(20.0);
        em.getTransaction().commit();
    }
}
