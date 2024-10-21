public class Name {
    private String name1, name2, otchestvo;
    // Конструкторы
    public Name() {
        this.name1 = name1;
        this.name2 = name2;
        this.otchestvo = otchestvo;
    }
    // Методы доступа
    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2; // Исправлено на name2
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (name2 != null) result.append(name2).append(" ");
        if (name1 != null) result.append(name1).append(" ");
        if (otchestvo != null) result.append(otchestvo);
        return result.toString().trim(); //trim - чтобы убрать лишние пробелы
    }
}

