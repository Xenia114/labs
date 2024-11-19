package ru.voronchihina.rabotnik;

public class otdel {
    private String nazvanie;
    private rabotnik nachalnik;

    public otdel(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public rabotnik getNachalnik() {
        return nachalnik; // Исправлено
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNachalnik(rabotnik nachalnik) {
        if (nachalnik.getWhere_you_work() != this) { // Исправлено
            throw new IllegalArgumentException(nachalnik.getName() + " должен работать в своем отделе.");
        }
        this.nachalnik = nachalnik;
    }
}

