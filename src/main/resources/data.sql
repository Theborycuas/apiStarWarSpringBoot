DROP TABLE IF EXISTS personaje;
CREATE TABLE personaje (id serial PRIMARY KEY, name VARCHAR(255), birthyear VARCHAR(255), specie VARCHAR(255), height VARCHAR(255), mass VARCHAR(255), gender VARCHAR(255), haircolor VARCHAR(255), skincolor VARCHAR(255), homeworld VARCHAR(255));

INSERT INTO personaje (name, birthyear, specie, height, mass, gender, haircolor, skincolor, homeworld) VALUES ('Darth Vader', '41.9BBY', 'Unknown', '202cm', '136kg', 'Male', 'None', 'White', 'Tatooine');
INSERT INTO personaje ( name, birthyear, specie, height, mass, gender, haircolor, skincolor, homeworld) VALUES ('Leia Organa', '19BBY', 'Unknown', '150cm', '49kg', 'Female', 'Brown', 'Light', 'Aleraan');
INSERT INTO personaje ( name, birthyear, specie, height, mass, gender, haircolor, skincolor, homeworld) VALUES ('Anakin Skywalker', '41.9BBY', 'Unknown', '188cm', '84kg', 'Male', 'Blond', 'Fair', 'Tatooine');

INSERT INTO film ( datecreated, director, openingcrawl, producer) VALUES ('23/03/1996', 'Carlos Alvarez', '222', 'Carlos2');
INSERT INTO film ( datecreated, director, openingcrawl, producer) VALUES ('23/03/1996', 'Carlos Alvarez', '222', 'Carlos3');
INSERT INTO film ( datecreated, director, openingcrawl, producer) VALUES ('23/03/1996', 'Carlos Alvarez', '222', 'Carlos4');

INSERT INTO planet ( climate, diameter, gravity, orbitalperiod, population, rotationperiod, surfacewater, terrain) VALUES ('Calido', '202', '2332', '3223', '2222', '122', '1232', '1212');
