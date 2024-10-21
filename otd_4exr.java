import java.util.List;
import java.util.ArrayList;

public class otd_4exr {
    private String name;
    private sotrud_4exr manager;
    private List<sotrud_4exr> employees = new ArrayList<>();

    public otd_4exr(String name, sotrud_4exr manager) {
        this.name = name;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void addPeop(sotrud_4exr employee) {
        employees.add(employee);
    }

    public List<sotrud_4exr> getPeop() {
        return employees;
    }
}
