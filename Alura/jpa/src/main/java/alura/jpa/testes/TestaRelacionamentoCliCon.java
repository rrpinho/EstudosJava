package alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import alura.jpa.modelo.Cliente;
import alura.jpa.modelo.Conta;

public class TestaRelacionamentoCliCon 
{
    public static void main(String[] args) 
    {
        Conta conta = new Conta();
        conta.setId(1L);

        Cliente cliente = new Cliente();
        cliente.setNome("Garrosh");
        cliente.setEndereco("Dalaran");
        cliente.setProfissao("Guerreiro");
        cliente.setConta(conta);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(cliente);

        em.getTransaction().commit();
        em.close();
    }
}
