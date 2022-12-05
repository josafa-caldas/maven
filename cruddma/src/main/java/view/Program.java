package view;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entityes.Enderecos;
import entityes.Perfil;
import entityes.Usuario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Perfil perfil = new Perfil(1, "ADM");
		Enderecos end = new Enderecos(1, "Rua A", 40000);
		List lista = new ArrayList();
		lista.add(end);
		
//		Criando as conexoes e implementando as persistencias
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("crudDma-jpa");
		EntityManager em = emf.createEntityManager();
		
/*	**** DUVIDAS*************************
	Quando coloco uma colecao no construtor, da pau na execucao
	como a implementacao do mavem implementa o modelo mvc? aqui estou chamando ass entidades na view!!
	
	Como o será criado o MER nesse tipo de im plementacao? como defino chaves
	
	PRECISA CRIAR OBJETO PARA AS ENTIDADES USUARIO_ENDERECO E CADASTRO_USUARIO?
	
	*/
		
		Usuario user = new Usuario("Carlos", "38102595515", "carlos@gmail.com", perfil);
		
//		Salvando no banco
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		
		
		
		

	}

}
