
@login
Feature: Je souhaite verifier la page de connexion
  ETQ utilisateur je souhaite verifier la page de connexion

 	@login-valide
 	Scenario:connexion avec des donnees valides 
    Given Je visite le site nopcommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le mot de passe "admin"
    And Je clique sur le bouton login
    Then je me redirige vers la page de home
