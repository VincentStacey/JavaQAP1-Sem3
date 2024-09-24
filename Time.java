public class Time {
    // Attributes //
    private int hour;
    private int minute;
    private int second;

    // Constructors //
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getters //
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Setters //
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // Methods //
    // Method to set the time //
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Method to return the time in HH:MM:SS format //
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Method to return the time +1 second //
    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour = (hour + 1) % 24;
            }
        }
        return this;
    }

    // Method to return the time -1 second //
    public Time previousSecond() {
        second--;
        if (second == -1) {
            second = 59;
            minute--;
            if (minute == -1) {
                minute = 59;
                hour = (hour - 1 + 24) % 24;
            }
        }
        return this;
    }

}