import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class Ochered {
    public static Queue<Integer> buildQueue(List<Integer> list){
        Queue<Integer> q = new LinkedList<>();

        // Добавляем элементы в прямом порядке
        for (int element : list) {
            q.add(element);
        }

        // Добавляем элементы в обратном порядке
        for (int i = list.size() - 1; i >= 0; i--) {
            q.add(list.get(i));
        }

        return q;
    }
}
