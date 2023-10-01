Feature: Je souhaite tester  la deconnexion de l application Swag Labs
  ETQ utuisateur Je veux pouvoir me déconnecter de l application Swag Labs
  
@logout
  Scenario: Je souhaite tester la page deconnexion
    Given Je me connecte à l application Swag Labs
    When Je clique sur le menu burger
    And Je clique sur logout
    Then Je me redirige vers la page de la connexion "Swag Labs"