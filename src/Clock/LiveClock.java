package Clock;


import java.text.SimpleDateFormat;
import java.util.Calendar;


public class LiveClock {

    private void time()
    {

        Calendar calendar;
        SimpleDateFormat simpleTime;


    }

    public static void main(String[] args) {
        String times;
        SimpleDateFormat simpleTime = new SimpleDateFormat();
        simpleTime = new SimpleDateFormat("hh:mm:ss");

        while(true){
            times = simpleTime.format(Calendar.getInstance().getTime());
            System.out.println(times);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }}

    }
    public LiveClock() {
        String times;
        SimpleDateFormat simpleTime = new SimpleDateFormat();
        simpleTime = new SimpleDateFormat("hh:mm:ss");

        while(true){
            times = simpleTime.format(Calendar.getInstance().getTime());
            System.out.println(times);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }}

    }
}