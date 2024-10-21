public class Time {
    private int secundtime;

    public Time(){
        this.secundtime=secundtime;
    }

    public int getSecundtime() {
        return secundtime;
    }

    public void setSecundtime(int secundtime) {
        this.secundtime = secundtime;
    }

    public String toString(){

        int secinday = 24*3600;
        int ostatafterday = secundtime%secinday;
        int hours = ostatafterday / 3600;
        int minutes = (ostatafterday % 3600) / 60;
        int seconds = ostatafterday % 60;

        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }
}
