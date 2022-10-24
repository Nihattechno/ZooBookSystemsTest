Feature: Login Functionality


  Background:
  Given Navigate to Netflix website

    Scenario: Enter with valid credential
      Scenario Outline:
      And User click element on the DialogContent
        |SignIn |
      And User sending keys on the DialogContent
        |Username |<Username_Input> |
        |Password |<Password_Input> |
      And User click element on the DialogContent
        |SignInButton |

      Then The result message must have been displayed
        |<R_Element> |<R_Input> |
        Examples:
          |Username_Input  |Password_Input |R_Element  |R_Input  |
          |grille9112@gmail.com  |Grille9112 |ValidResult  |Umut Nihat  |



  Scenario: Enter with invalid Email valid password
  Scenario Outline:
    And User click element on the DialogContent
      |SignIn |
    And User sending keys on the DialogContent
      |Username |<Username_Input> |
      |Password |<Password_Input> |
    And User click element on the DialogContent
      |SignInButton |

    Then The result message must have been displayed
      |<R_Element> |<R_Input> |
    Examples:
      |Username_Input  |Password_Input |R_Element  |R_Input  |
      |grille91121@gmail.com  |Grille9112 |InvalidResult  |Bu e‑posta adresi ile bağlantılı bir hesap bulamadık.  |



  Scenario: Enter with valid Email invalid password
  Scenario Outline:
    And User click element on the DialogContent
      |SignIn |
    And User sending keys on the DialogContent
      |Username |<Username_Input> |
      |Password |<Password_Input> |
    And User click element on the DialogContent
      |SignInButton |

    Then The result message must have been displayed
      |<R_Element> |<R_Input> |
    Examples:
      |Username_Input  |Password_Input |R_Element  |R_Input  |
      |grille9112@gmail.com  |Grille91121 |InvalidResult  |Parola yanlış.  |
