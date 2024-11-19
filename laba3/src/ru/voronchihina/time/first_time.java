package ru.voronchihina.time;

public class first_time {
    private int hours;
    private int minutes;
    private int seconds;


    public first_time(int allseconds) {
        if (allseconds < 0) {
            throw new IllegalArgumentException("Количество секунд не может быть отрицательным.");
        }
        int sicinday = 24 * 3600;
        int ostatok_posle_day = allseconds % sicinday;
        this.hours = ostatok_posle_day / 3600;
        this.minutes = (ostatok_posle_day % 3600) / 60;
        this.seconds = ostatok_posle_day % 60;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public String toString() {
        return  String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

