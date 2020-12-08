#Author: yonga fils jacques and cabrel 

@tag
Feature: Inscrire une voiture de Formule 1 dans un stand
En tant que Technicien
Je veux inscrire une voiture au stand de mon équipe, avec des critères techniques devant vérifier
le règlements, notamment le poids de la voiture <poids>, la quantité d’essence autorisée hors du
réservoir <qte>, le volume du moteur <volume>, et la conformité de l’aileron <aileron>.

  @tag1
  Scenario: attribution d’un numéro à la voiture
    Given l’inscription d’un voiture avec ses attributs <poids>, <qte>, <volume>, <aileron>
    When la voiture est en evaluation  
    Then le numéro de la voiture doit être automatiquement attribué
    

  @tag2
  Scenario Outline:  voiture inscrite avec succes
    Given inscription d’un voiture avec ses attributs <poids>, <qte>, <volume>, <aileron>
    When on insere les caracteristiques suivantes <poids > <qte>  <volume> <aileron>
    Then voiture <inscrite>

    Examples: 
      | name  | poids | qte     | volume| aileron|
      |ferrari|   720 | 220     | 3     |  yes   |
      | lambo |    710| 239     | 2     |  yes   |
      
       @tag3
  Scenario Outline:  voiture  non inscrite 
    Given inscription d’un voiture avec ses attributs <poids>, <qte>, <volume>, <aileron>
    When on insere les caracteristiques suivantes <poids > <qte>  <volume> <aileron>
    Then voiture < non inscrite>
    
        Examples: 
      | name  | poids | qte     | volume| aileron|
      |ferrari|   720 | 220     | 3     |  no    |
      | lambo |    710| 239     | 2     |  no    |
      
