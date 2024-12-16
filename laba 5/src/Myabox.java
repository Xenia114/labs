
public class Myabox implements Mewing {
    private final Mewing cat;
    private int cnt=0;

    public Myabox(Mewing scat){
        this.cat=scat;
    }

    public void mow(){
        cat.mow();
        cnt++;
    }

    public int getCnt() {
        return cnt;
    }

    public Mewing getCat() {
        return cat;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
