DROP TABLE IF EXISTS personaje;
CREATE TABLE personaje (id serial PRIMARY KEY, name VARCHAR(255), birthyear VARCHAR(255), specie VARCHAR(255), height VARCHAR(255), mass VARCHAR(255), gender VARCHAR(255), haircolor VARCHAR(255), skincolor VARCHAR(255), homeworld VARCHAR(255), image VARCHAR(500));
INSERT INTO personaje (name, birthyear, specie, height, mass, gender, haircolor, skincolor, homeworld, image) VALUES ('Darth Vader', '41.9BBY', 'Unknown', '202cm', '136kg', 'Male', 'None', 'White', 'Tatooine', 'https://upload.wikimedia.org/wikipedia/commons/3/32/Star_Wars_-_Darth_Vader.jpg');
INSERT INTO personaje (name, birthyear, specie, height, mass, gender, haircolor, skincolor, homeworld, image) VALUES ('Leia Organa', '19BBY', 'Unknown', '150cm', '49kg', 'Female', 'Brown', 'Light', 'Aleraan', 'https://www.lavanguardia.com/files/og_thumbnail/uploads/2017/12/08/5fa3d8e24f841.jpeg');
INSERT INTO personaje (name, birthyear, specie, height, mass, gender, haircolor, skincolor, homeworld, image) VALUES ('Baby Yoga', '41.9BBY', 'Unknown', '188cm', '84kg', 'Male', 'Blond', 'Fair', 'Tatooine', 'https://en.meming.world/images/en/5/50/Baby_Yoda.jpg');

DROP TABLE IF EXISTS film;
CREATE TABLE film (id serial PRIMARY KEY, datecreated VARCHAR(255), director VARCHAR(255), openingcrawl VARCHAR(255), producer VARCHAR(255), image VARCHAR(500));
INSERT INTO film (datecreated, director, openingcrawl, producer, image) VALUES ('23/03/1996', 'Carlos Alvarez', '222', 'Carlos2', '');
INSERT INTO film (datecreated, director, openingcrawl, producer, image) VALUES ('23/03/1996', 'Carlos Alvarez', '222', 'Carlos3', '');
INSERT INTO film (datecreated, director, openingcrawl, producer, image) VALUES ('23/03/1996', 'Carlos Alvarez', '222', 'Carlos4', '');

DROP TABLE IF EXISTS planet;
CREATE TABLE planet (id serial PRIMARY KEY, name VARCHAR(255), climate VARCHAR(255), diameter VARCHAR(255), gravity VARCHAR(255), orbitalperiod VARCHAR(255), population VARCHAR(255), rotationperiod VARCHAR(255), surfacewater VARCHAR(255), terrain VARCHAR(255), image VARCHAR(500));
INSERT INTO planet (name, climate, diameter, gravity, orbitalperiod, population, rotationperiod, surfacewater, terrain, image) VALUES ('Calido', '202', '2332', '3223', '2222', '122', '1232', '1212', '1212', '');
