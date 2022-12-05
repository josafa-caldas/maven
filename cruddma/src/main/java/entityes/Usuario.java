package entityes;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable{
	
		private static final long serialVersionUID = 1L;
		
		private String name;
		@Id
		private String cpf;
		private String email;
		private Perfil perfil;
//		
//		Quando imcluo esse atributo do tipo collection dá pau
//		private List<Enderecos> enderecos;
		
		public Usuario() {
			
		}

		public Usuario(String name, String cpf, String email, Perfil perfil) {
			super();
			this.name = name;
			this.cpf = cpf;
			this.email = email;
			this.perfil = perfil;
//			this.enderecos = enderecos;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Perfil getPerfil() {
			return perfil;
		}

		public void setPerfil(Perfil perfil) {
			this.perfil = perfil;
		}

//		public List<Enderecos> getEnderecos() {
//			return enderecos;
//		}

//		public void setEnderecos(List<Enderecos> enderecos) {
//			this.enderecos = enderecos;
//		}
//
//		@Override
//		public String toString() {
//			return "Usuario [name=" + name + ", cpf=" + cpf + ", email=" + email + ", perfil=" + perfil + ", enderecos="
//					+ enderecos + "]";
//		}
		
		
		
		
		
		
		

}
