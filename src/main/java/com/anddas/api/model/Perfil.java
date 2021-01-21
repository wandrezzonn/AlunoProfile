package com.anddas.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="perfil")
public class Perfil {
	
	public Perfil() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_perfil")
	private Integer idPerfil;
	
	@Column(name = "youtube")
	private String youtube;
	
	@Column(name = "facebook")
	private String facebook;
	
	
	@Column(name = "likedin")
	private String likedin;
	
	
	
	public Integer getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}
	public String getYoutube() {
		return youtube;
	}
	public void setYoutube(String youtube) {
		this.youtube = youtube;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getLikedin() {
		return likedin;
	}
	public void setLikedin(String likedin) {
		this.likedin = likedin;
	}
	
	
	
	

}
