import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class Ochered {
    public static <T> Queue<T> buildQueue(List<T> list) {
        Queue<T> q = new LinkedList<>();

        // Добавляем элементы в прямом порядке
        for (T element : list) {
            q.add(element);
        }

        // Добавляем элементы в обратном порядке
        for (int i = list.size() - 1; i >= 0; i--) {
            q.add(list.get(i));
        }

        return q;
    }
}
