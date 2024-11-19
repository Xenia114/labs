package ru.voronchihina.rabotnik;

public class rabotnik {
    private String name;
    private otdel where_you_work;

    public rabotnik(String name, otdel where_you_work) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым!");
        }
        this.name = name;
        this.where_you_work = where_you_work;
    }

    public String getName() {
        return name;
    }

    public otdel getWhere_you_work() {
        return where_you_work;
    }

    @Override
    public String toString() {
        if (this == where_you_work.getNachalnik()) {
            return name + " начальник отдела " + where_you_work.getNazvanie();
        } else {
            return name + " работает в отделе " + where_you_work.getNazvanie() + ", начальник которого " + where_you_work.getNachalnik().getName();
        }

    }
}
