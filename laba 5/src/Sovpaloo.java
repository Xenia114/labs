import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sovpaloo {
    public static List<Integer> Sovpalo(List<Integer> L1, List<Integer> L2) {
        Set<Integer> setL1 = new HashSet<>(L1);
        Set<Integer> setL2 = new HashSet<>(L2);
        List<Integer> result = new ArrayList<>();

        // Находим общие элементы
        for (Integer element : setL1) {
            if (setL2.contains(element)) {
                result.add(element);
            }
        }

        // Находим уникальные элементы из L1
        for (Integer element : setL1) {
            if (!setL2.contains(element)) {
                result.add(element);
            }
        }

        // Находим уникальные элементы из L2
        for (Integer element : setL2) {
            if (!setL1.contains(element)) {
                result.add(element);
            }
        }

        return result;
    }
}
