#Autor:José Luis García
  @stories
  Feature: Registro de nuevo usuario en Utest
    @scenario1
    Scenario: Registro de Jose en plataforma Utest
      Given Jose espera aprender mucho de pruebas de software
      When Completara el formulario completo con sus datos
        | strFirstName | strLastName | strEmail         | strBirthMonth | strBirthDay | strBirthYear | strCity        | strCodePostal | strCountry | strComputer   | strVersion | strLanguage | strMobileDevice | strMobileModel | strSystem | strPassword       |
        | Lionel       | Messi       | messi11@gmail.com| December      | 14          | 1987         | Rio de Janeiro | 190004        | Brazil     | Linux         | Xebian     | Serbian     | Apple           | iPhone 5S      | iOS 10.11 | PepitoPerez-12345 |
      Then Finaliza el registro al completar los formularios
        | strTextFinish    |
        | Registro exitoso |