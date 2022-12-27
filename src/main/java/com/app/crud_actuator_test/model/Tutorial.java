package com.app.crud_actuator_test.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "tutoriales")

public class Tutorial {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private long id;
	
	@Column(name = "titulo")
	private String title;
	
	@Column(name = "descripcion")
	private String description;
	
	@Column(name="publicada")
	private boolean published;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	public Tutorial() {
		
	}

	public Tutorial(String titulo, String descripcion, boolean published) {
		super();
		this.title = titulo;
		this.description = descripcion;
		this.published = published;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", titulo=" + title + ", descripcion=" + description + ", published=" + published
				+ "]";
	} 
	
	

}
