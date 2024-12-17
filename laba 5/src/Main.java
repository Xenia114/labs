import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
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

                        Inter_drob decimal1 = new Drob(1, 2);
                        Inter_drob decimal2 = new Drob(-5, -2);

                        Kesh decimalCache1 = new Kesh(decimal1);
                        out.println(decimalCache1.getValue());
                        out.println(decimalCache1.getValue());
                        out.println(decimalCache1.getValue());


                        decimalCache1.setZZnamen(3,5);
                        out.println(decimalCache1.getValue());
                        out.println(decimalCache1.getValue());
                        out.println(decimalCache1.getValue());

                        out.println("Равны ли дроби? " + decimal1.equals(decimal2));

                    break;
                case 2:
                    Mewing barsik = new Cat("Барсик");
                    Mewing nesi = new Cat("Неси");
                    Mewing ser = new Cat("Сережа");

                    mewmew.meowsCare(barsik);
                    mewmew.meowsCare(nesi);
                    mewmew.meowsCare(ser);
                    break;
                case 3:
                    List<Integer> L1 = new ArrayList<>();
                    List<Integer> L2 = new ArrayList<>();

                    // Добавляем элементы в L1
                    L1.add(1);
                    L1.add(2);
                    L1.add(3);
                    L1.add(4);
                    L1.add(5);

                    // Добавляем элементы в L2
                    L2.add(3);
                    L2.add(4);
                    L2.add(5);
                    L2.add(6);
                    L2.add(7);

                    // Вызываем метод для формирования списка L
                    List<Integer> L = Sovpaloo.Sovpalo(L1, L2);
                    out.println("Исходные списки: ");
                    out.println("L1: " + L1);
                    out.println("L2: " + L2);
                    // Выводим результат
                    System.out.println("Список L (элементы без дублирования): " + L);
                    break;
                case 4:
                case 5:
                    String file = "text_for_laba5.txt";
                    RUSSIONletters action = new RUSSIONletters();

                    try {
                        // Читаем и обрабатываем файл
                        Set<Character> bukvi = action.getLetters(file);
                        String originalText = Files.readString(Paths.get(file)); // Чтение файла в строку
                        System.out.println("Исходный текст:\n" + originalText);
                        // Выводим результаты
                        System.out.println("Количество уникальных букв: " + bukvi.size());
                        System.out.println("Уникальные буквы: " + bukvi);
                    } catch (IOException e) {
                        System.out.println("Ошибка при чтении файла: " + e.getMessage());
                    }
                    break;
                case 6:
                    List<Integer> LL = Arrays.asList(1, 2, 3);

                    Queue<Integer> ochered = Ochered.buildQueue(LL);
                    out.println("Исходный список: " + LL);
                    out.println("Очередь: " + ochered);
                    break;
            }


        }
    }
}