package ru.voronchihina.store;

public class Store<T> {
    private final T elem;

    public Store(T elem){
        this.elem=elem;
    }

    public T getElem(T alter) {
        if (elem != null){
            return elem;
        }
        else{
            return alter;
        }

    }

    public String toString() {
        if (elem!=null){
            return "Значение в хранилище: " + elem +"\nВозвращаем значение: ";
        }
        return "Значение в Хранилище - null, поэтому возвращаем альтернативное значение: " ;
    }
}
/*public T poluchitalter(
    Store <T> store, T allter){
        return store.getElem(allter);
    }*/