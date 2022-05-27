package co.empresa.bbva.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
	private Integer id;
	private String nombre;
	private String email;
	private String pass;
	
	public User(String nombre, String email, String pass) {
		this.nombre = nombre;
		this.email = email;
		this.pass = pass;
	}
	
}
