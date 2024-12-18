-- Insérer des condos avec différentes tailles et caractéristiques
INSERT INTO logements (id, description, salles_bain, meubles_inclus, prix, taille, chauffage, electromenagers, wifi, air_clim)
VALUES
    (1, 'Condo 1 et ½, idéal pour étudiant', 1, 0, 800.00, '1 et ½', TRUE, FALSE, TRUE, FALSE);

INSERT INTO logements (id, description, salles_bain, meubles_inclus, prix, taille, chauffage, electromenagers, wifi, air_clim)
VALUES
    (2, 'Condo 2 et ½ avec balcon, proche des transports', 1, 1, 1200.00, '2 et ½', TRUE, TRUE, TRUE, TRUE);

INSERT INTO logements (id, description, salles_bain, meubles_inclus, prix, taille, chauffage, electromenagers, wifi, air_clim)
VALUES
    (3, 'Condo 3 et ½ spacieux, parfait pour une famille', 1, 1, 1800.00, '3 et ½', TRUE, TRUE, TRUE, TRUE);

INSERT INTO logements (id, description, salles_bain, meubles_inclus, prix, taille, chauffage, electromenagers, wifi, air_clim)
VALUES
    (4, 'Condo 4 et ½ rénové avec cuisine équipée', 2, 1, 950.00, '1 et ½', TRUE, TRUE, TRUE, TRUE);

INSERT INTO logements (id, description, salles_bain, meubles_inclus, prix, taille, chauffage, electromenagers, wifi, air_clim)
VALUES
    (5, 'Condo 5 et ½ lumineux, non meublé', 2, 0, 1000.00, '2 et ½', FALSE, FALSE, TRUE, FALSE);

INSERT INTO utilisateurs (nom, email, mot_de_passe)
VALUES ('Jean Dupont', 'jean.dupont@example.com', 'motDePasse123');

INSERT INTO utilisateurs (nom, email, mot_de_passe)
VALUES ('Marie Curie', 'marie.curie@example.com', 'monSecret456');

INSERT INTO utilisateurs (nom, email, mot_de_passe)
VALUES ('Albert Einstein', 'albert.einstein@example.com', 'relativite789');

-- Réinitialiser les séquences
-- Utilisé pour régler le problème avec les requêtes POST
ALTER TABLE logements ALTER COLUMN id RESTART WITH (SELECT MAX(id) + 1 FROM logements);
ALTER TABLE utilisateurs ALTER COLUMN id RESTART WITH (SELECT MAX(id) + 1 FROM utilisateurs);


