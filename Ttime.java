public class Ttime {
    private int hours;
    private int minutes;
    private int seconds;
    private int ttottalSeconds;

    // Конструктор по количеству секунд с начала суток
    public Ttime(int totalSeconds) {
        int     secinday = 24*3600;
        int ostatafterday = totalSeconds%secinday;
        this.hours = ostatafterday / 3600;         // Количество часов
        this.minutes = (ostatafterday % 3600) / 60; // Количество минут
        this.seconds = ostatafterday % 60;
        this.ttottalSeconds = totalSeconds;        // Оставшиеся секунды
    }

    // Метод для представления времени в виде строки
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    // Метод для получения текущего часа
    public int getCurrentHour() {
        return hours;
    }

    // Метод для получения количества минут с начала текущего часа
    public int getMinutesFromHourStart() {
        return minutes;
    }

    // Метод для получения количества секунд с начала текущей минуты
    public int getSecondsFromMinuteStart() {
        return seconds;
    }
}
