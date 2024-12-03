package ru.voronchihina.funcs;

import java.util.List;
import java.util.function.BinaryOperator;
//BinaryOperator который позволяет работать с аргументами типа Т и возвращать значение этого же типа
//accumulator фнкция, которая добавляет элемент списка к результату.
public class socratit {
    public <T> T reduce(List<T> list, BinaryOperator<T> accumulator, T nachal_znach_res) {
        if (list == null || list.isEmpty()) {
            return nachal_znach_res;
        }
        T result = nachal_znach_res;
        for (T el : list) {
            result = accumulator.apply(result, el);
        }
        return result;
    }
}
