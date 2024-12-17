// Интерфейс для дробей
interface Inter_drob {
    double getValue();
    void setZZnamen(int chislitel, int znamenatel);
}

// Класс Дробь, реализующий интерфейс Inter_drob
public class Drob implements Inter_drob {
    private int chislitel;
    private int znamenatel;

    // Конструктор
    public Drob(int chisl, int znam) {
        if (znam == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю!");
        }
        if (znam < 0) {
            chisl = -chisl;
            znam = -znam;
        }
        this.chislitel = chisl;
        this.znamenatel = znam;
    }

    @Override
    public void setZZnamen(int cc, int zz) {
        if (zz == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю!");
        }
        if (zz < 0) {
            zz = -zz;
            cc = -cc;
        }
        this.znamenatel = zz;
        this.chislitel = cc;
    }

    @Override
    public double getValue() {
        return (double) chislitel / znamenatel;
    }

    public int getChislitel() {
        return chislitel;
    }

    public int getZnamenatel() {
        return znamenatel;
    }

    // для сравнения дробей
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Drob)) {
            return false; // Проверка на правильный тип
        }
        Drob dr = (Drob) obj; // Приведение объекта к типу Drob
        return chislitel == dr.chislitel && znamenatel == dr.znamenatel;
    }

    @Override
    public String toString() {
        return "Дробь: " + getChislitel() + " / " + getZnamenatel() + " = " + getValue();
    }
}