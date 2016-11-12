package org.smartcompras.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "produtos")
public class Produto {

	@Id
	private int idProduto;
	private String produto;
	private String imgProduto;
	private String marca;
	private String tipoProduto;

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getImgProduto() {
		return imgProduto;
	}

	public void setImgProduto(String imgProduto) {
		this.imgProduto = imgProduto;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Produto(int idProduto, String produto, String imgProduto, String marca, String tipoProduto) {
		this.idProduto = idProduto;
		this.produto = produto;
		this.imgProduto = imgProduto;
		this.marca = marca;
		this.tipoProduto = tipoProduto;
	}

	

}
