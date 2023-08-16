package org.example.w3resource.com.inheritance;

public abstract class Pojazd {
    private String marka;
    private String model;
    private int rok;
    private String paliwo;
    private double spalanie;

    public Pojazd(String marka, String model, int rok, String paliwo, double spalanie) {
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.paliwo = paliwo;
        this.spalanie = spalanie;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getRok() {
        return rok;
    }

    public String getPaliwo() {
        return paliwo;
    }

    public double getSpalanie() {
        return spalanie;
    }

    public abstract double obliczSpalanie();

    public abstract double obliczZasieg();

    public abstract double obliczMaxPredkosc();
}

class TIR extends Pojazd {
    private double cargoPojemnosc;

    public double getcargoPojemnosc() {
        return cargoPojemnosc;
    }

    public TIR(String marka, String model, int rok, String paliwo, double zuzyciePaliwa) {
        super(marka, model, rok, paliwo, zuzyciePaliwa);
    }


    @Override
    public double obliczSpalanie() {
        return getSpalanie() * (1.0 / (1.0 + (getcargoPojemnosc() / 1000.0)));
    }

    @Override
    public double obliczZasieg() {
        return obliczSpalanie() * getSpalanie();
    }

    @Override
    public double obliczMaxPredkosc() {
        return 80.0;
    }
}

class Auto extends Pojazd {
    private int iloscSiedzen;

    public Auto(String marka, String model, int rok, String paliwo, double spalanie, int iloscSiedzen) {
        super(marka, model, rok, paliwo, spalanie);
        this.iloscSiedzen = iloscSiedzen;
    }

    public int getIloscSiedzen() {
        return iloscSiedzen;
    }

    @Override
    public double obliczSpalanie() {
        return getSpalanie() * (1.0 / (1.0 + (getIloscSiedzen() / 5.0)));
    }

    @Override
    public double obliczZasieg() {
        return obliczSpalanie() * getSpalanie();
    }

    @Override
    public double obliczMaxPredkosc() {
        return 120.0;
    }
}

class Motocykl extends Pojazd {
    private double silnik;

    public Motocykl(String marka, String model, int rok, String paliwo, double spalanie, double silnik) {
        super(marka, model, rok, paliwo, spalanie);
        this.silnik = silnik;
    }

    public double getSilnik() {
        return silnik;
    }

    @Override
    public double obliczSpalanie() {
        return getSpalanie() * (1.0 / (1.0 + (getSilnik() / 1000.0)));
    }

    @Override
    public double obliczZasieg() {
        return obliczSpalanie() * getSpalanie();
    }

    @Override
    public double obliczMaxPredkosc() {
        return 80;
    }
}

class Main10 {
    public static void main(String[] args) {
        TIR tir = new TIR("Star", "Starachov", 2021, "Benzyna", 8);
        Auto auto = new Auto("Fiat", "Punto", 2020, "Olej", 7.7, 6);
        Motocykl motor = new Motocykl("Junak", "Pegaz", 2019, "Hybryd", 6.21, 8);
        System.out.println("Model Tira: " + tir.getModel());
        System.out.println("Spalanie: " + tir.obliczSpalanie());
        System.out.println("Przejachany dystans: " + tir.obliczZasieg());
        System.out.println("Maksymalna prędkość: " + tir.obliczMaxPredkosc());

        System.out.println("Model samochodu: " + auto.getModel());
        System.out.println("Spalanie: " + auto.obliczSpalanie() + " mpg");
        System.out.println("Przejachany dystans: " + auto.obliczZasieg() + " miles");
        System.out.println("Max Speed: " + auto.obliczMaxPredkosc() + " km/h\n");

        System.out.println("Model motoru: " + motor.getModel());
        System.out.println("Spalanie: " + motor.obliczSpalanie() + " mpg");
        System.out.println("Przejachany dystans: " + motor.obliczZasieg() + " miles");
        System.out.println("Max Speed: " + motor.obliczMaxPredkosc() + " mph");
    }
}






