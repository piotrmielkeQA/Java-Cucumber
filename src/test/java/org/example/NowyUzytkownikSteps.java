package org.example;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class NowyUzytkownikSteps {

    @Given("Uzytkownik jest na stronie formularza dodawania nowego uzytkownika")
    public void uzytkownikJestNaStronieFormularza() {
        System.out.println("Jestem na stronie formularza rejestracji nowego uzytkownika");
    }

    @When("Wprowadzamy poprawne dane do formularza")
    public void wprowadzamyPoprawneDaneDoFormularza(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap(String.class, String.class);
        System.out.println("Imie " + data.get("imie"));
        System.out.println("Nazwisko " + data.get("nazwisko"));
        System.out.println("Miasto " + data.get("miasto"));
        System.out.println("Ulica " + data.get("ulica"));

        
    }

    @Then("Informacja o dodaniu uzytkownika pojawia sie na erkanie")
    public void informacjaODodaniuUzytkownikaPojawiaSieNaErkanie() {
        System.out.println("Dodano nowego uzytkownika");
    }
}
