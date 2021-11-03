public class Bankomat {

    private int saldo;

    public void wplataPieniedzy (int wplata) {
        if(wplata>0) {
            saldo = saldo + wplata;
        }
    }

    public void wyplataPieniedzy (int wyplata) {
        if (wyplata<=saldo) {
            saldo = saldo - wyplata;
        } else {
            System.out.println("Nie masz wystarczajacej kwoty na koncie");
        }
    }
    public int pokazSaldo() {
        System.out.println("Masz na koncie " + saldo);
        return saldo;
    }

}

