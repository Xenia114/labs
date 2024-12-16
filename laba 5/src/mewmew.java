
public class mewmew {
    public static void meowsCare(Mewing cat) {
        cat = new Myabox(cat);//делаем объект типа Myabox

        Myabox counter = (Myabox) cat;

        // Вызываем метод meow() несколько раз
        for (int i = 0; i < 5; i++) {
            counter.mow();
        }

        // Выводим количество мяуканий
        System.out.println(counter.getCat() + " мяукал " + counter.getCnt() + " раз.");
    }
}

