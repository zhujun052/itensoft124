package com.itensoft;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cert entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "Cert", schema = "dbo", catalog = "phoenix")
public class Cert implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private String publicKey;
	private String privateKey;
	private String actived;

	// Constructors

	/** default constructor */
	public Cert() {
	}

	/** minimal constructor */
	public Cert(String id, String name, String publicKey, String privateKey) {
		this.id = id;
		this.name = name;
		this.publicKey = publicKey;
		this.privateKey = privateKey;
	}

	/** full constructor */
	public Cert(String id, String name, String publicKey, String privateKey,
			String actived) {
		this.id = id;
		this.name = name;
		this.publicKey = publicKey;
		this.privateKey = privateKey;
		this.actived = actived;
	}

	// Property accessors
	@Id
	@Column(name = "Id", unique = true, nullable = false, length = 32)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "Name", nullable = false, length = 32)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "PublicKey", nullable = false, length = 356)
	public String getPublicKey() {
		return this.publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	@Column(name = "PrivateKey", nullable = false, length = 968)
	public String getPrivateKey() {
		return this.privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	@Column(name = "Actived", length = 1)
	public String getActived() {
		return this.actived;
	}

	public void setActived(String actived) {
		this.actived = actived;
	}

}