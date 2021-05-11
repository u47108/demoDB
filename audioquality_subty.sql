
--/home/luxo/uml-generated-code/classification_type.sql:

--
-- TABLE: Classification_type
-- 
-- 

CREATE TABLE Classification_type (
nombres varchar NOT NULL 
);

-- 
ALTER TABLE Classification_type ADD COLUMN id SERIAL PRIMARY KEY;




----/home/luxo/uml-generated-code/audioquality_type.sql:

--
-- TABLE: Audioquality_type
-- 
-- 

CREATE TABLE Audioquality_type (
nombres varchar NOT NULL 
);

-- 
ALTER TABLE Audioquality_type ADD COLUMN id SERIAL PRIMARY KEY;


--/home/luxo/uml-generated-code/audioquality_subtype.sql:

--
-- TABLE: Audioquality_subtype
-- 
-- 

CREATE TABLE Audioquality_subtype (
nombres varchar NOT NULL 
);

-- 
ALTER TABLE Audioquality_subtype ADD COLUMN id SERIAL PRIMARY KEY;

-- 
ALTER TABLE Audioquality_subtype ADD CONSTRAINT type_id FOREIGN KEY (id) REFERENCES Audioquality_type(id) ON UPDATE CASCADE ON DELETE CASCADE;






--/home/luxo/uml-generated-code/classification_subtype.sql:

--
-- TABLE: Classification_subtype
-- 
-- 

CREATE TABLE Classification_subtype (
nombres varchar NOT NULL 
);

-- 
ALTER TABLE Classification_subtype ADD COLUMN id SERIAL PRIMARY KEY;

-- 
ALTER TABLE Classification_subtype ADD CONSTRAINT type_id FOREIGN KEY (id) REFERENCES Classification_type(id) ON UPDATE CASCADE ON DELETE CASCADE;



--/home/luxo/uml-generated-code/profile.sql:

--
-- TABLE: Profile
-- 
-- 

CREATE TABLE Profile (
nombres varchar NOT NULL 
);

-- 
ALTER TABLE Profile ADD COLUMN id SERIAL PRIMARY KEY;


--/home/luxo/uml-generated-code/role.sql:

--
-- TABLE: Role
-- 
-- 

CREATE TABLE Roles (
nombres varchar NOT NULL 
);

-- 
ALTER TABLE Roles ADD COLUMN id SERIAL PRIMARY KEY;



--/home/luxo/uml-generated-code/user.sql:

--
-- TABLE: User
-- 
-- 

CREATE TABLE Users (
lenguage varchar NOT NULL ,
nombres varchar NOT NULL 
);

-- 
ALTER TABLE Users ADD CONSTRAINT profile_id FOREIGN KEY (id) REFERENCES Profile(id) ON UPDATE CASCADE ON DELETE CASCADE;







--/home/luxo/uml-generated-code/role_classification.sql:

--
-- TABLE: Role_classification
-- 
-- 

CREATE TABLE Role_classification (
);

-- 
ALTER TABLE Role_classification ADD CONSTRAINT fk_idrole FOREIGN KEY (id) REFERENCES Roles(id) ON UPDATE CASCADE ON DELETE CASCADE;

-- 
ALTER TABLE Role_classification ADD CONSTRAINT fk_classification_type FOREIGN KEY (id) REFERENCES Classification_type(id) ON UPDATE CASCADE ON DELETE CASCADE;

-- 
ALTER TABLE Role_classification ADD CONSTRAINT fk_id_profile FOREIGN KEY (id) REFERENCES Profile(id) ON UPDATE CASCADE ON DELETE CASCADE;









--/home/luxo/uml-generated-code/calls_clasifitacion.sql:

--
-- TABLE: Calls_clasifitacion
-- 
-- 

CREATE TABLE Calls_clasifitacion (
created_at  varchar NOT null,
client varchar NOT NULL ,
observations varchar NOT NULL ,
user_number varchar NOT NULL 
);

-- 
ALTER TABLE Calls_clasifitacion ADD COLUMN id SERIAL PRIMARY KEY;

-- 
ALTER TABLE Calls_clasifitacion ADD CONSTRAINT id_user FOREIGN KEY (id) REFERENCES Users(id) ON UPDATE CASCADE ON DELETE CASCADE;

-- 
ALTER TABLE Calls_clasifitacion ADD CONSTRAINT audio_quality_type_id FOREIGN KEY (id) REFERENCES Audioquality_type(id) ON UPDATE CASCADE ON DELETE CASCADE;

-- 
ALTER TABLE Calls_clasifitacion ADD CONSTRAINT clasification_type_id FOREIGN KEY (id) REFERENCES Classification_type(id) ON UPDATE CASCADE ON DELETE CASCADE;