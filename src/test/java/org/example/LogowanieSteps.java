package org.example;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class LogowanieSteps {

    private Logowanie logowanie;

    private String username;
    private String password;

    @Given("Użytkownik jest na stronie logowania")
    public void użytkownikJestNaStronieLogowania() {
        logowanie = new Logowanie();
    }

    @And("Użytkownik o nazwie {string} i hasle {string} istnieje w bazie danych")
    public void użytkownikONazwieIHasleIstniejeWBazieDanych(String login, String haslo) {
        logowanie.logIn(login,haslo);

    }

    @When("Użytkownik wprowadza poprawną nazwę użytkownika {string} i hasło {string}")
    public void użytkownikWprowadzaPoprawnąNazwęUżytkownikaIHasło(String login, String password) {
        System.out.println("Użytkownik podaję login i haslo" + login + " " + password);
        this.username = login;
        this.password = password;
        logowanie.setUserInDatabase(login,password);
    }

    @And("Użytkownik klika przycisk zaloguj")
    public void użytkownikKlikaPrzyciskZaloguj() {
    }

    @Then("Użytkownik zostaje zalogowany na stronie domowej aplikacji")
    public void użytkownikZostajeZalogowanyNaStronieDomowejAplikacji() {
        Assert.assertFalse(logowanie.isLoggedIn());
    }

    @And("Informacja o udanym logowaniu zostanie wyświetlona")
    public void informacjaOUdanymLogowaniuZostanieWyświetlona() {
        Assert.assertFalse(logowanie.getMsg().equals("Udało Ci się zalogowować"));
    }

    @But("Dane logowania są niepoprawne")
    public void daneLogowaniaSąNiepoprawne() {
        String databaseUsername = logowanie.getCurrentUsername();
        String databasePassword = logowanie.getCurrentPassword();
        Assert.assertTrue(username.equals(logowanie.getCurrentUsername()) && password.equals(logowanie.getCurrentPassword()));

    }

    @Then("Użytkownik nie zostaje przekierowany na stronę domową aplikacji")
    public void użytkownikNieZostajePrzekierowanyNaStronęDomowąAplikacji() {
        Assert.assertFalse(logowanie.isLoggedIn());
    }

    @And("Informacja o nieudanej próbie logowania zostaje wyświetlona na ekranie")
    public void informacjaONieudanejPróbieLogowaniaZostajeWyświetlonaNaEkranie() {
        Assert.assertTrue(logowanie.getMsg().equals("Nie udało Ci się zalogować"));
    }

}