Feature: Logowanie użytkownika na stronie Guru99

  Scenario: Poprawne logowanie
    Given User is on the Guru99 login page
    When User enters username "mngr528705" and password "UzymuvA"
    And User clicks the login button
    Then User should see the message "Welcome To Manager's Page of GTPL Bank"

  Scenario: Niepoprawne logowanie
    Given User is on the Guru99 login page
    When User enters username "invalidusername" and password "invalidpassword"
    And User clicks the login button
    Then User should see the message "User or Password is not valid"
