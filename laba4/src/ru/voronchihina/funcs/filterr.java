package ru.voronchihina.funcs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class filterr {
    public  <T> List<T> filter(List<T> ishodn_list, Predicate<T> predicate)  {
        // Новый список для хранения результатов
        List<T> result = new ArrayList<>();

        // Проходим по каждому элементу входного списка
        for (T el : ishodn_list) {
            // Преобразуем элемент с помощью функции и добавляем в новый список
            if (predicate.test(el)) {
                result.add(el);
            }
        }

        // Возвращаем новый список
        return result;
    }
}
