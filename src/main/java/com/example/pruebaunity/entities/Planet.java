package com.example.pruebaunity.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "planet")
public class Planet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "population")
	private String population;
	@Column(name = "rotationperiod")
	private String rotationPeriod;
	@Column(name = "orbitalperiod")
	private String orbitalPeriod;
	@Column(name = "diameter")
	private String diameter;
	@Column(name = "gravity")
	private String gravity;

	@Column(name = "terrain")
	private String terrain;
	@Column(name = "surfacewater")
	private String surfaceWater;
	@Column(name = "climate")
	private String climate;

}
