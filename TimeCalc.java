public class TimeCalc {
    private int seconds;

    final int SEC_PER_MIN = 60;
    final int SEC_PER_HR = 3600;
    final int SEC_PER_DAY = 86400;

    public TimeCalc(int sec) {
        seconds = sec;
    }

    public void setSec(int sec) {
        seconds = sec;
    }

    public int secToMin() {
        int mins = 0;

        if (seconds >= SEC_PER_MIN)
        {
            mins = seconds / SEC_PER_MIN;
        }

        return mins;
    }

    public int secToHr() {
        int hrs = 0;

        if (seconds >= SEC_PER_HR)
        {
            hrs=seconds/SEC_PER_HR;
        }

        return hrs;
    }

    public int secToDay() {
        int days = 0;

        if (seconds >= SEC_PER_DAY)
        {
            days=seconds/SEC_PER_DAY;
        }

        return days;
    }
}