package ru.voronchihina.box;

public class box <T> {
    T element;

    public void add_element(T thing) throws IllegalAccessException {
        if (element==null){
            this.element = thing;
        }
        else{
            throw new IllegalAccessException("Коробка заполнена!");
        }
    }

    public T poluchit(){
        if (element == null){
            return null;
        }
        T temp = element;
        element = null;
        return temp;
    }
    public boolean isEmpty() {
        return element == null; // Если элемент null, значит коробка пуста
    }

    public String toString() {
        if (isEmpty()) {
            return "Коробка пуста!";
        } else {
            return "Значение в коробке: " + element.toString();
        }
    }
}




