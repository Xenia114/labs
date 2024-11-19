package ru.voronchihina.main;
import ru.voronchihina.rabotnik.rabotnik;
import ru.voronchihina.rabotnik.otdel;
import ru.voronchihina.time.first_time;
import ru.voronchihina.geometry.Point3D;


import java.util.Scanner;

import static java.lang.System.out;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        for (int io = 0; io < 10; io++) {
            System.out.println("\nВведите номер задачи (1-6): ");
            int exr = in.nextInt();
            in.nextLine(); // Очистка буфера после ввода числа
            switch (exr) {
                case 1:
                    out.println("\nВведите от 1-3, чтобы посмотреть сколько 1-часов, 2-минут, 3-секунд  соответствуют времени, которое вы зададите:");
                    int ed = in.nextInt();
                    out.println("\nВведите время: ");
                    int ghj = in.nextInt();
                    first_time ttime = new first_time(ghj);
                    switch (ed) {
                        case 1:
                            out.println("Текущий час: " + ttime.getHours() + ". Время - " + ttime);
                            break;
                        case 2:
                            out.println("Минут с начала часа: " + ttime.getMinutes() + ". Время - " + ttime);
                            break;
                        case 3:
                            out.println("Секунд с начала минуты: " + ttime.getSeconds() + ". Время - " + ttime);
                            break;
                    }
                    break;
                case 2:
                    otdel rabochi_ugol = new otdel("we");
                    otdel other_ugolok = new otdel("are");

                    rabotnik sotr_1 = new rabotnik("Шишкин", rabochi_ugol);
                    rabotnik sotr_2 = new rabotnik("Балюкин", other_ugolok);
                    rabotnik sotr_3 = new rabotnik("Меньшиков", rabochi_ugol);

                    rabochi_ugol.setNachalnik(sotr_2);
                    other_ugolok.setNachalnik(sotr_3);

                    out.println(sotr_1);
                    out.println(sotr_2);
                    out.println(sotr_3);

                    break;
                case 3:
                    out.print("Введите количество точек: ");

                    int num = in.nextInt();

                    Point3D[] points = new Point3D[num];

                    out.println("Введите координаты этих точек (x y z):");

                    for (int i = 0; i < num; i++) {
                        out.println("Точка " + (i + 1) + ":");
                        out.print("x: ");
                        double x = in.nextDouble();
                        out.print("y: ");
                        double y = in.nextDouble();
                        out.print("z: ");
                        double z = in.nextDouble();
                        points[i] = new Point3D(x, y, z);
                    }

                    out.println("\nТекстовое представление точек:");
                    for (Point3D point : points) {
                        out.println(point);
                    }
                    break;
                default:
                    out.println("Неверный номер задачи. Пожалуйста, введите число от 1 до 6.");
                    break;
            }
        }
    }
}