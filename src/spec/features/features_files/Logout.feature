@logout
Feature: Je souhaite tester  la deconnexion de l application Swag Labs
  ETQ utuisateur Je veux pouvoir me déconnecter de l application Swag Labs

  Background: 
    Given Je me connecte a l application
    When Je saisi le username "standard_user"
    When Je saisi le password "secret_sauce"
    When Je clique sur le bouton login

  @logout
  Scenario: Je souhaite tester la page deconnexion
    When Je clique sur le menu burger
    And Je clique sur logout
    Then Je me redirige vers la page de la connexion "swag labs"
