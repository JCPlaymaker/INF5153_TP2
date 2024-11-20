-- Drop the table if it exists to avoid conflicts
DROP TABLE IF EXISTS logements;

-- Create the table again
CREATE TABLE logements (
    id INTEGER PRIMARY KEY,
    description VARCHAR(255) NOT NULL,
    salles_bain INTEGER NOT NULL,
    meubles_inclus INTEGER NOT NULL,
    prix NUMERIC(12,2) NOT NULL,
    taille VARCHAR(15) NOT NULL,
    chauffage BOOLEAN NOT NULL,
    electromenagers BOOLEAN NOT NULL,
    wifi BOOLEAN NOT NULL,
    air_clim BOOLEAN NOT NULL
);
