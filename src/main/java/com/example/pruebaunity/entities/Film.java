package com.example.pruebaunity.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "film")
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "datecreated")
	private String dateCreated;
	@Column(name = "director")
	private String director;
	@Column(name = "producer")
	private String producer;
	@Column(name = "openingcrawl")
	private String openingCrawl;

	public Film() {
	}

	public Film(Long id, String dateCreated, String director, String producer, String openingCrawl) {
		this.id = id;
		this.dateCreated = dateCreated;
		this.director = director;
		this.producer = producer;
		this.openingCrawl = openingCrawl;
	}


}
