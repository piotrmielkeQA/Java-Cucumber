Feature: Wypłata pieniędzy z bankomatu

  Scenario: Próba wypłacenia większej ilości niż saldo konta
    Given Konto z saldem 200 zł
    When Użytkownik próbuję wypłacić 300 zł
    Then Saldo nie zmienia się i wynosi 200 zł