@login
Feature: Je souhaite tester la page de la connexion deconnexion de l application Swag Labs
  ETQ utuisateur je souhaite tester la page de connexion de l application Swag Labs

  @login_casPassant
  Scenario: Je souhaite tester la page connexion avec un cas passant
    Given Je me connecte à l application Swag Labs
    Then Je me redirige vers la page home "Products"

  @login_casNonPassant
  Scenario: Je souhaite tester la page connexion avec un cas non  passant
    Given Je me connecte à l application Swag Labs avec non correct coordonnes
    Then Le message d erreur s affiche "Epic sadface: Username and password do not match any user in this service"

    
