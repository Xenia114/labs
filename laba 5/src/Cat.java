
interface Mewing{
    void mow();
}

public class Cat implements Mewing{
    private String klichka;

    public Cat(String name){
        this.klichka = name;
    }

    public void mow(){
        System.out.println(klichka + ": мяу!");
    }

    @Override
    public String toString() {
        return "кот: "+ klichka;
    }

}
