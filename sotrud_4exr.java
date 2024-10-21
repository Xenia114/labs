import java.util.List;

public class sotrud_4exr {
    private String name;
    private otd_4exr department;

    public sotrud_4exr(String name, otd_4exr department) {
        this.name = name;
        this.department = department;
    }

    public String getNames() {
        return name;
    }


    public List<sotrud_4exr> getfgh() {
        return department.getPeop();
    }
}
