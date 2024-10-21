public class Sotrudnik_3exr {
    private String namesotr;
    private otdel_3exr otdel;

    public Sotrudnik_3exr(String namesotr, otdel_3exr otdel){
        this.namesotr = namesotr;
        this.otdel = otdel;
    }

    public String getNamesotr() {
        return namesotr;
    }

    public String toString(){
        if (Sotrudnik_3exr.this==otdel.getBoss()){
            return namesotr + " начальник отдела " + otdel.getNotdel();}
        else{
            return namesotr + " работает в отделе " + otdel.getNotdel() + ", начальник которого " + otdel.getBoss().getNamesotr();
        }
    }
}


