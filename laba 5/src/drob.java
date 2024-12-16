// Интерфейс для дробей
interface Inter_drob {
    double getValue();
    void setZZnamen(int zz, int cc);
}

// Класс Дробь, реализующий интерфейс Inter_drob
public class drob implements Inter_drob {
    private int chislitel;
    private int znamenatel;
    private Double kesh = null;

    // Конструктор
    public drob(int chisl, int znam) {
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
        if (this.znamenatel != zz || this.chislitel != cc) {
            this.znamenatel = zz;
            this.chislitel = cc;
            kesh = null; // Сброс кеша
        }
    }

    @Override
    public double getValue() {
        if (kesh == null) {
            kesh = (double) chislitel / znamenatel;
        }
        return kesh;
    }

    public double getChislitel() {
        return chislitel;
    }

    public double getZnamenatel() {
        return znamenatel;
    }

    // для сравнения дробей
    public boolean equals(Object obj) {
        drob dr = (drob) obj;//приводим объект к типу drop для доступа к полям числитель, знаменатель
        return chislitel == dr.chislitel && znamenatel == dr.znamenatel;
    }

    public String toString() {
        return "Дробь: " + getChislitel() + " / " + getZnamenatel() + " = " + getValue();
    }
}