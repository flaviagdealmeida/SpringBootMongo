package org.smartcompras.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection="marcas")
public class Marca {


	@Id
	private String id;
	private String marca;
	
	public Marca(){}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Marca(String id, String marca) {
		
		this.id = id;
		this.marca = marca;
	}
	
	
	
	

}
