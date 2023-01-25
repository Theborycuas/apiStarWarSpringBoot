package com.example.pruebaunity.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "personaje")
public class Personaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "birthyear")
	private String birthyear;
	
	@Column(name = "specie")
	private String specie;
	
	@Column(name = "height")
	private String height;
	
	@Column(name = "mass")
	private String mass;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "haircolor")
	private String haircolor;
	
	@Column(name = "skincolor")
	private String skincolor;

	@Column(name = "homeworld")
	private String homeworld;
	
	@Column(name = "image")
	private String image;

}
