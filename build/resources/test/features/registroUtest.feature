#Autor:José Luis García
  @stories
  Feature: Registro de nuevo usuario en Utest
    @scenario1
    Scenario: Registro de Jose en plataforma Utest
      Given Jose espera aprender mucho de pruebas de software
      When Completara el formulario completo con sus datos
        | strFirstName | strLastName | strEmail         | strBirthMonth | strBirthDay | strBirthYear |
        | Lionel       | Messi       | messi10@gmail.com| December      | 14          | 1987         |
      Then Finaliza el registro al completar los formularios