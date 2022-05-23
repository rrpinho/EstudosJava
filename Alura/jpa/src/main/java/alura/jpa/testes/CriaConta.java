package alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import alura.jpa.modelo.Conta;

public class CriaConta 
{
    public static void main(String[] args) 
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        Conta conta = new Conta();
        conta.setTitular("Leonardo");
        conta.setNumero(1234);
        conta.setAgencia(4321);

        em.getTransaction().begin();
        em.persist(conta);
        em.getTransaction().commit();
        em.close();

        System.out.println("Id da conta criada: " + conta.getId());

        EntityManager em2 = emf.createEntityManager();
        conta.setSaldo(150.0);

        em2.getTransaction().begin();
        em2.merge(conta);
        em2.getTransaction().commit();


    }    
}
