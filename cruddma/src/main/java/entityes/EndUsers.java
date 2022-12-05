package entityes;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class EndUsers implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Usuario user;
	private Enderecos end;
	
	public EndUsers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EndUsers(int id, Usuario user, Enderecos end) {
		super();
		this.id = id;
		this.user = user;
		this.end = end;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public Enderecos getEnd() {
		return end;
	}

	public void setEnd(Enderecos end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "EndUsers [user=" + user + ", end=" + end + "]";
	}
	
	
}
