package com.app01.demo.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Role implements Serializable {
	
	private static final long serialVersionUID = 6353963609310956029L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native", strategy="native")
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	/*
	 * Setter and Getter		
	 */
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(description, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		return Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Role [id=" + this.id + ", name=" + this.name + ", description=" + "]";
	}
	
	
	
	
	
}
