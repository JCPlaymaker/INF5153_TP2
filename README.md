Pour tester les différents types de requêtes, utiliser le fichier ``logement-api.http`` avec IntelliJ ou avec Postman  
Ou bien sur le terminal faire les commandes suivantes  
1. Récupérer tous les logements (Utilise une requête GET pour récupérer tous les logements dans la base de données)  
``curl -X GET http://localhost:8080/logement``
2. Ajouter un nouveau logement (Utilise une requête POST avec un corps JSON pour ajouter un nouveau logement)  
```
curl -X POST http://localhost:8080/logement \
-H "Content-Type: application/json" \
-d '{
  "description": "Studio moderne",
  "salles_bain": 1,
  "meubles_inclus": 1,
  "prix": 900,
  "taille": "40 m²",
  "chauffage": true,
  "electromenagers": true,
  "wifi": true,
  "air_clim": false
}'
```
3. Récupérer un logement par ID (Pour récupérer un logement spécifique, utilise une requête GET avec l’ID du logement)  
``curl -X GET http://localhost:8080/logement/1``
4. Supprimer un logement (Pour supprimer un logement par ID, utilise une requête DELETE)  
``curl -X DELETE http://localhost:8080/logement/1``
