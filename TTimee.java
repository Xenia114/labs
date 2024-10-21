public class TTimee {
        private int hours;
        private int minutes;
        private int seconds;
        private int tottalSeconds;


    public int getHours() {
        return hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getTottalSeconds() {
        return tottalSeconds;
    }

    // Конструктор по количеству секунд с начала суток
        public TTimee(int totalSeconds) {
            int     secinday = 24*3600;
            int ostatafterday = totalSeconds%secinday;
            this.hours = ostatafterday / 3600;         // Количество часов
            this.minutes = (ostatafterday % 3600) / 60; // Количество минут
            this.seconds = ostatafterday % 60;
            this.tottalSeconds = totalSeconds;
            // Оставшиеся секунды
        }

        // Конструктор по часам, минутам и секундам
        public TTimee(int hours, int minutes, int seconds) {
            // Гарантия корректного времени
            this.hours = hours % 24;
            this.minutes = minutes % 60;
            this.seconds = seconds % 60;
        }

        // Метод для представления времени в виде строки
        @Override
        public String toString() {
            return String.format("%02d:%02d:%02d", hours, minutes, seconds);
        }

    }
