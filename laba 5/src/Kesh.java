public class Kesh{
    private Inter_drob d;
    private Double cachedValue;

    public Kesh(Inter_drob dr) {
        d = dr;
        cachedValue = null;
    }

    public double getValue() {
        if (cachedValue==null){
            cachedValue = d.getValue();
            System.out.println("fkfkfkf");
        }
        return cachedValue;
    }

    public void setZZnamen(int zz, int cc) {
        d.setZZnamen(zz, cc);
        cachedValue = null;

    }
}