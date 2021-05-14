package com.example.demo.entities;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import net.bytebuddy.implementation.bind.annotation.Empty;

@Entity
public class User {
	@Id
	@NotEmpty
	@Size(min=5,max=15)
	private String username;
	@NotEmpty
	private String password;
	private String matchingPassword;
	private boolean actived;
	@ManyToMany
	@JoinTable(name="USERS_ROLES")
	private Collection<Role> roles;
	@NotEmpty
	@Email
	private String email;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateNaissance;
	private int tel;
	private String nationalite;
	private String adresse;
	private String emploi;
	private int cin;
	
	public String getEmploi() {
		return emploi;
	}
	public void setEmploi(String emploi) {
		this.emploi = emploi;
	}
	
	public boolean isActived() {
		return actived;
	}
	public void setActived(boolean actived) {
		this.actived = actived;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	
	public User(String username, String password, boolean actived, Collection<Role> roles) {
		super();
		this.username = username;
		this.password = password;
		this.actived = actived;
		this.roles = roles;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getMatchingPassword() {
		return matchingPassword;
	}
	public void setMatchingPassword(String matchingPassword) {
		this.matchingPassword = matchingPassword;
	}
	public User(@NotEmpty @Size(min = 5, max = 15) String username, @NotEmpty String password, String matchingPassword,
			boolean actived, Collection<Role> roles, @NotEmpty @Email String email, Date dateNaissance, int tel,
			String nationalite, String adresse, String emploi, int cin) {
		super();
		this.username = username;
		this.password = password;
		this.matchingPassword = matchingPassword;
		this.actived = actived;
		this.roles = roles;
		this.email = email;
		this.dateNaissance = dateNaissance;
		this.tel = tel;
		this.nationalite = nationalite;
		this.adresse = adresse;
		this.emploi = emploi;
		this.cin = cin;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	
	
	
}
