package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
	
		// O banco de dados é responsável por atribuir e incrementar o id
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
		// Instanciando o EntityManagerFactory com as configurações contidas no arquivo persistence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		
		// Conexão com o banco de dados e contexto de persistência implementado
		EntityManager em = emf.createEntityManager();
		
		/* 
		 * Persistindo objetos no banco de dados
		 * O JPA necessita de uma transação em operações que não são uma simples consulta
		 */
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		// ---------------------------
		
		// Buscando pelo id e instanciando objeto com os dados retornados
		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
		// ---------------------------
		
		/*
		 * JPA só consegue remover uma entidade que esteja monitorada (inserida ou recuperada do banco de dados)
		 * Não é possível enviar uma instância de objeto destacada
		 */
//		p = new Pessoa(1, null, null);
		p = em.find(Pessoa.class, 4);
		
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		
		em.close();
		emf.close();
	}

}
