package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class MyStepdefs {

    @Before
    public void setUp() {
        System.out.println("Metoda wykonana przed scenariuszem");
    }

    @Given("Konto z saldem 200 zł")
    public void konto_s_saldem() {
        System.out.println("Metoda given konto z saldem");
    }

    @When("Użytkownik próbuję wypłacić 300 zł")
    public void wyplata_z_konta() {
        System.out.println("Metoda when wyplata z konta");
    }

    @Then("Saldo nie zmienia się i wynosi 200 zł")
    public void sprawdzenie_salda() {
        System.out.println("Metoda then sprawdzenie salda konta");
    }

    @After
    public void tearDown() {
        System.out.println("Metoda wykonana po scenariuszu");
    }
}
