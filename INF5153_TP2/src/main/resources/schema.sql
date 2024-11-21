-- Drop the table if it exists to avoid conflicts
DROP TABLE IF EXISTS logements;

-- Create the table again
CREATE TABLE logements (
    id INT AUTO_INCREMENT PRIMARY KEY,
       description VARCHAR(255) NOT NULL,
       salles_bain INTEGER,
       meubles_inclus INTEGER,
       prix NUMERIC(12,2) NOT NULL,
       taille VARCHAR(50) NOT NULL,
       chauffage BOOLEAN,
       electromenagers BOOLEAN,
       wifi BOOLEAN,
       air_clim BOOLEAN
);



