Feature: Dodawanie uzytkownika

  Scenario: Dodawanie uzytkownika z poprawnymi danymi

    Given Uzytkownik jest na stronie formularza dodawania nowego uzytkownika
    When Wprowadzamy poprawne dane do formularza
    |imie|<imie>|
    |nazwisko|<nazwisko>|
    |miasto|<miasto>|
    |ulica|<ulica>|
    Then Informacja o dodaniu uzytkownika pojawia sie na erkanie

    Examples:
    |imie|nazwisko|miasto|ulica|
    |Tomasz|Kot|Warszawa|Warszawska|
    |Jan|Kowalski|Wrocaław|Wrocławska|