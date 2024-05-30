Feature: Apertura de una nueva cuenta en Parabank
  Como usuario Quiero abrir una nueva cuenta en Parabank
  Para poder verificarla en el resumen de cuentas

  Scenario: Open a new account in Parabank
    Given quiero navegar a la página de registro de Parabank
    When y quiero Registrar una nueva cuenta con los siguientes datos "Bryan", "Steve", "123 Street", "City", "State", "12345", "123456789", "12312", "Steve123", "password123"
    Then Verifico que la cuenta con el número "12345" existe en el resumen de la cuenta
