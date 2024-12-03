package ru.voronchihina.main;

import ru.voronchihina.box.box;
import ru.voronchihina.store.Store;
import ru.voronchihina.tochka.point3d;
import ru.voronchihina.funcs.apply;
import ru.voronchihina.funcs.filterr;
import ru.voronchihina.funcs.socratit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        for (int io = 0; io < 10; io++) {
            out.println("\nВведите номер задачи (1-6): ");
            int exr = in.nextInt();
            in.nextLine(); // Очистка буфера после ввода числа
            switch (exr) {
                case 1:
                    box<Integer> intbbox = new box<Integer>();
                    for (int i = 0; i < 6; i++) {
                        int obj = 3;
                        out.println("Хотите добавить или достать элемент '3' из коробки?\nдобавить - 1, достать -2");
                        int yesno = in.nextInt();
                        switch (yesno) {
                            case 1:
                                intbbox.add_element(obj);
                                out.println(intbbox);
                                break;
                            case 2:
                                intbbox.poluchit();
                                out.println(intbbox);
                                break;
                            default:
                                out.println("error");
                                break;
                        }
                    }
                case 2:
                    Store<Integer> Hranilize = new Store<Integer>(null);
                    out.println(Hranilize);
                    poluchAlter(Hranilize, 0);

                    Store<Integer> Hraniliz = new Store<Integer>(99);
                    out.println(Hraniliz);
                    poluchAlter(Hraniliz, -1);

                    Store<String> Hranili = new Store<String>(null);
                    out.println(Hranili);
                    poluchAlter(Hranili, "default");

                    Store<String> Hranil = new Store<String>("hello");
                    out.println(Hranil);
                    poluchAlter(Hranil, "hello world");
                    break;
                case 3:
                    out.print("Введите параметры точки (x, y, z): ");
                    double x = in.nextInt();
                    double y = in.nextInt();
                    double z = in.nextInt();
                    box<point3d> bbox = new box<>();
                    point3d poin = new point3d(x, y, z);
                    tochka_AND_box(bbox, poin);
                    break;
                case 4:
                    apply ap = new apply();

                    List<String> spisok = Arrays.asList("qwerty", "asdfg", "zx");
                    List<Integer> lengths = ap.applyy(spisok, String::length);
                    out.println("Длины строк: " + lengths);

                    List<Integer> Sppisok_int = Arrays.asList(1, -3, 7);
                    List<Integer> moduls_chisel = ap.applyy(Sppisok_int, Math::abs);
                    out.println("Модули чисел: " + moduls_chisel);

                    List<int[]>  arrays = Arrays.asList(
                            new int[]{1, 2, 3},
                            new int[]{4, -5, 6},
                            new int[]{7, 8, 9}
                    );
                    List<Integer> spisochek_max = ap.applyy(arrays, array -> {
                        int max = -10000000;
                        for (int num : array) {
                            if (num > max) {
                                max = num;
                            }
                        }
                        return max;
                    });
                    out.println("Максимумы из массивов: " + spisochek_max);
                    break;
                case 5:
                    filterr fit = new filterr();

                    List<String> spisok_na_proverku = Arrays.asList("qwerty", "asdfg", "zx");
                    Predicate<String> len_word = s -> s.length() <3;
                    List<String> res_filt_words = fit.filter(spisok_na_proverku, len_word);
                    out.println("Отфильтрованные строки: " + res_filt_words);

                    List<Integer> spisok_na_proverku2 = Arrays.asList(1, -3, 7);
                    Predicate<Integer> polozh_chisla = n -> n>0;
                    List<Integer> res_polozh = fit.filter(spisok_na_proverku2, polozh_chisla);
                    out.println("Отфильтрованные строки: " + res_polozh);

                    List<int[]>  array_s = Arrays.asList(
                            new int[]{1, 2, 3},
                            new int[]{-4, -5, -6},
                            new int[]{7, 8, 9}
                    );
                    Predicate<int[]> bez_polozhitel_chisel = array -> {
                        for (int num : array){
                            if (num >0){
                                return false;
                            }
                        }
                        return true;
                    };
                    List<int[]> res_bez_polozh = fit.filter(array_s, bez_polozhitel_chisel);
                    out.println("профильтрованные массивы: " + Arrays.deepToString(res_bez_polozh.toArray()));
                    break;
                case 6:
                    socratit reducer = new socratit();

                    List<String> spIsok = Arrays.asList("qwerty", "asdfg", "zx");
                    BinaryOperator<String> obedinenie = (s1, s2) -> s1+s2;//функция объединения строк
                    String soed_our_stroki = reducer.reduce(spIsok, obedinenie, "");
                    out.println("Объединение строк: "+soed_our_stroki);

                    List<Integer> chisla = Arrays.asList(1, -3, 7);
                    BinaryOperator<Integer> summm = (s1, s2) -> s1+s2;
                    Integer sum = reducer.reduce(chisla, summm, 0);
                    out.println("Cумма чисел: "+ sum);
                    break;
                    /*List<List<T>> spisku_v_spiskax = new ArrayList<>();

                    // Создаём вложенные списки
                    List<Integer> list1 = List.of(1, 2, 3);
                    List<Integer> list2 = List.of(4, 5, 6);
                    List<Integer> list3 = List.of(7, 8, 9);
                    BinaryOperator<String> obedineni = (s1, s2) -> s1+s2;//функция объединения строк
                    String soed_our_strok = reducer.reduce(spisku_v_spiskax, obedineni, "");
                    out.println("Общее количество чисел в списках: "+ spisku_v_spiskax);*/
                default:
                    out.println("Неверный номер задачи. Пожалуйста, введите число от 1 до 6.");
                    break;


            }
        }
    }

    public static <T> void poluchAlter(Store<T> st, T alt) {
        out.println(st.getElem(alt));
    }

    public static void tochka_AND_box(box<point3d> bb, point3d ttochka) throws IllegalAccessException {
        bb.add_element(ttochka);
        out.println(bb);
    }
}


