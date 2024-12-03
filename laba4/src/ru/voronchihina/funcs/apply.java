package ru.voronchihina.funcs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class apply {
    // Обобщённый метод: преобразует элементы списка с помощью заданной функции
    public <T, P> List<P> applyy(List<T> ishodn_list, Function<T, P> preobr) {
        // Новый список для хранения результатов
        List<P> result = new ArrayList<>();

        // Проходим по каждому элементу входного списка
        for (T el : ishodn_list) {
            // Преобразуем элемент с помощью функции и добавляем в новый список
            P new_el = preobr.apply(el);
            result.add(new_el);
        }

        // Возвращаем новый список
        return result;
    }
}