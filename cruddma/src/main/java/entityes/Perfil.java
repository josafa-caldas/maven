package entityes;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Perfil implements Serializable{

	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String tipo;
		
		
		public Perfil() {
			
		}


		


		public Perfil(int id, String tipo) {
			super();
			this.id = id;
			this.tipo = tipo;
		}





		public int getId() {
			return id;
		}





		public void setId(int id) {
			this.id = id;
		}





		public String getTipo() {
			return tipo;
		}





		public void setTipo(String tipo) {
			this.tipo = tipo;
		}





		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		

}
