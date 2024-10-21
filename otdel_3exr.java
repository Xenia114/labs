public class otdel_3exr {
    private Sotrudnik_3exr boss;
    private String notdel;

    public otdel_3exr(String notdel){
        this.notdel = notdel;
    }

    public String getNotdel() {
        return notdel;
    }

    public Sotrudnik_3exr getBoss() {
        return boss;
    }

    public void setBoss(Sotrudnik_3exr sotrudnik3exr) {
        this.boss = sotrudnik3exr;
    }
}
