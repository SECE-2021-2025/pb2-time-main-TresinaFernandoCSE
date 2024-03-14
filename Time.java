package Timer;
public class Time {
    private Integer hour;
    private Integer minute;
    private Integer seconds;

    public Time(Integer hour, Integer minute, Integer seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    //Getter & Setter for hour
    public Integer getHour() {
        return this.hour;
    }
    public void setHour(Integer hour) {
        this.hour = hour;
    }

    //Getter & Setter for minute
    public Integer getMinute() {
        return this.minute;
    }
    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    //Getter & Setter for seconds
    public Integer getSeconds() {
        return this.seconds;
    }
    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    //Set the time
    public void setTime(Integer hour, Integer minute, Integer seconds) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSeconds(seconds);
    }

    public Time nextSecond() {
        return new Time(this.getHour(), this.getMinute(), this.getSeconds() + 1);
    }

    public Time previousSecond() {
        return new Time(this.getHour(), this.getMinute(), this.getSeconds() - 1);
    }

    @Override
    public String toString() {
        String hh;
        String mm;
        String ss;
        if(this.getHour() < 10) {
            hh = "0" + this.getHour();
        }
        else {
            hh = "" + this.getHour();
        }
        if(this.getMinute() < 10) {
            mm = "0" + this.getMinute();
        }
        else {
            mm = "" + this.getMinute();
        }
        if(this.getSeconds() < 10) {
            ss = "0" + this.getSeconds();
        }
        else {
            ss = "" + this.getSeconds();
        }
        return hh + " : " + mm + " : " + ss;
    }
}
