Feature: Logowanie do aplikacji
  W tym pliku będziemy testować logowanie użtykownika
  do aplikacji. Sekcja ta jest traktowana jako opis
  i nie wpływa na wykonanie testu

  Background:
    Given Użytkownik jest na stronie logowania


  Scenario Outline: Użytkownik podaje poprawne dane
    # and opisuje dodatkową akcję lub warunek wstępny
    And Użytkownik o nazwie "<login>" i hasle "<haslo>" istnieje w bazie danych
    # when określa akcję która zostanie wykonana
    When Użytkownik wprowadza poprawną nazwę użytkownika "<login>" i hasło "<haslo>"
    # and opisuje dodatkową akcję
    And Użytkownik klika przycisk zaloguj
    # then opisuje wynik poprzednich kroków
    Then Użytkownik zostaje zalogowany na stronie domowej aplikacji
    # and opisuje dodatkowy wynik
    And Informacja o udanym logowaniu zostanie wyświetlona

    Examples:
    |login|haslo|
    |login1|haslo1|
    |login2|haslo2|

  Scenario: Użytkownik podaje błędne hasło
      Given Użytkownik jest na stronie logowania
      And Użytkownik o nazwie "login2" i hasle "haslo" istnieje w bazie danych
      When Użytkownik wprowadza poprawną nazwę użytkownika "login2" i hasło "zlehaslo"
      And Użytkownik klika przycisk zaloguj
      # but umożliwia dodanie negatywnego komentarza, używamy do negatywnych warunków
      But Dane logowania są niepoprawne
      Then Użytkownik nie zostaje przekierowany na stronę domową aplikacji
      And Informacja o nieudanej próbie logowania zostaje wyświetlona na ekranie
