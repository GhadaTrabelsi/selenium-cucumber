@cas
Feature: Je souhaite tester  le boutton about  de l application Swag Labs
  ETQ utuisateur Je veux pouvoir minformer sur  l application Swag Labs

Background: 
    Given Je me connecte à l application Swag Labs
    When Je clique sur le menu burger

  @logout
  Scenario: Je souhaite tester la page deconnexion
    And Je clique sur logout
    Then Je me redirige vers la page de la connexion "Swag Labs"
    
  @About
  Scenario: Je souhaite tester le bouton About
    And Je clique sur le bouton about
    Then Je me redirige a la page About 
