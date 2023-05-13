@login
Feature: Je souhaite tester la page de la connexion de l application Swag Labs
  ETQ utuisateur je souhaite tester la page de connexion de l application Swag Labs

  @login_casPassant
  Scenario: Je souhaite tester la page connexion avec un cas passant
    Given Je me connecte a l application
    When Je saisi le username
    And le password
    And Je clique sur le bouton login
    Then Je me redirige vers la page home "Products"
