package entityes;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Enderecos implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String logradouro;
	private int cep;
	
	
	public Enderecos() {
		
	}


	public Enderecos(int id, String logradouro, int cep) {
		this.id = id;
		this.logradouro = logradouro;
		this.cep = cep;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public int getCep() {
		return cep;
	}


	public void setCep(int cep) {
		this.cep = cep;
	}


	@Override
	public String toString() {
		return "Enderecos [logradouro=" + logradouro + ", cep=" + cep + "]";
	}
	
	


}
