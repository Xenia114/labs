import java.util.Scanner;
import static java.lang.System.out;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Name[] persons = new Name[3];
        for (int io = 0; io < 10; io++) {
            System.out.println("\nВведите номер задачи (1-6): ");
            int exr = in.nextInt();
            in.nextLine(); // Очистка буфера после ввода числа

            switch (exr) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        out.println("ФИО " + (i+1) + "-ого человека");
                        persons[i] = new Name();
                        out.println("Введите фамилию человека: ");
                        persons[i].setName2(in.nextLine());
                        out.println("Введите имя: ");
                        persons[i].setName1(in.nextLine());
                        out.println("Введите отчество: ");
                        persons[i].setOtchestvo(in.nextLine());
                    }

                    // Выводим введенные данные
                    out.println("\nВведенные данные:");

                    int cnt = 1;
                    for (Name person : persons) {
                        System.out.println(cnt + " - ФИО - " + person);
                        cnt++;
                    }
                    break;
                case 2:
                    out.println("\nВведите количество секунд, чтобы узнать время: ");
                    Time time = new Time(in.nextInt());
                        if (time.getSecundtime() > -1) {  // Проверка, что число больше или равно 0
                            out.println("\nВремя: ");
                            out.println(time);
                        } else {
                            out.println("Некорректный ввод! Число должно быть неотрицательным.");
                        }
                    break;
                case 3:
                    //создаем отдел it
                    out.println("Введите название отдела: ");
                    otdel_3exr it_otdel = new otdel_3exr(in.nextLine());
                    // создаем сотрудников
                    Sotrudnik_3exr sot_1_koz = new Sotrudnik_3exr("Козлов", it_otdel);
                    Sotrudnik_3exr sot_2_petr = new Sotrudnik_3exr("Петров", it_otdel);
                    Sotrudnik_3exr sot_3_sid = new Sotrudnik_3exr("Сидоров", it_otdel);

                    //назначаем козлова начальником
                    it_otdel.setBoss(sot_1_koz);

                    out.println(sot_1_koz);
                    out.println(sot_2_petr);
                    out.println(sot_3_sid);
                    break;
                case 4:
                    out.print("Введите название отдела: ");
                    String departmentName = in.nextLine();

                    // Ввод имени начальника отдела
                    out.print("Введите имя начальника отдела: ");
                    String managerName = in.nextLine();
                    sotrud_4exr manager = new sotrud_4exr(managerName, new otd_4exr(departmentName, null));

                    // Создание отдела с начальником
                    otd_4exr department = new otd_4exr(departmentName, manager);
                    manager = new sotrud_4exr(managerName, department);

                    // Добавление сотрудников
                    for (int i = 0; i < 3; i++) {
                        out.print("Введите имя " + (i+1) + "- ого сотрудника: ");
                        String employeeName = in.nextLine();
                        sotrud_4exr employee = new sotrud_4exr(employeeName, department);
                        department.addPeop(employee);
                    }

                    // Вывод информации о сотрудниках
                    out.println("\nИнформация о сотрудниках отдела "+department.getName()+" :");
                    for (sotrud_4exr emp : department.getPeop()) {
                        out.println(emp.getNames());
                    }

                    // Вывод списка сотрудников для начальника
                    out.println("\nСписок сотрудников отдела ("+department.getName()+") для " + manager.getNames() + "a :");
                    for (sotrud_4exr emp : manager.getfgh()) {
                        out.println(emp.getNames());
                    }
                    break;
                case 5:
                    out.println("Введите кол-во секунд, чтобы создать время ");
                    TTimee time1 = new TTimee(in.nextInt());
                    out.println("Время секунды): " + time1);
                    out.println("Введите кол-во часов, минут, секунд, чтобы создать время ");
                    TTimee time2 = new TTimee(in.nextInt(), in.nextInt(), in.nextInt());
                    out.println("Время ("+time2.getHours()+" часа, "+time2.getMinutes()+" минуты, "+time2.getSeconds()+" секунд): " + time2);
                    break;
                case 6:
                    out.println("\nВведите от 1-3, чтобы посмотреть сколько 1-часов, 2-минут, 3-секунд  соответствуют времени, которое вы зададите:");
                    int ed = in.nextInt();
                    out.println("\nВведите время: ");
                    int ghj = in.nextInt();
                    Ttime ttime = new Ttime(ghj);
                    switch (ed) {
                        case 1:
                            out.println("Текущий час: " + ttime.getCurrentHour() + ". Время - "+ ttime);
                            break;
                        case 2:
                            out.println("Минут с начала часа: " + ttime.getMinutesFromHourStart() + ". Время - "+ ttime);
                            break;
                        case 3:
                            out.println("Секунд с начала минуты: " + ttime.getSecondsFromMinuteStart() + ". Время - "+ ttime);
                            break;
                    }
                    break;
                default:
                    out.println("Неверный номер задачи. Пожалуйста, введите число от 1 до 6.");break;
            }

        }
    }
}
