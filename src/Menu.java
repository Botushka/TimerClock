
import Clock.LiveClock;
import Clock.Timer;

import java.util.Scanner;

public class Menu extends LiveClock {


    public static Object LiveClock;
    public static Object Timer;

    public static void main(String[] args) {
        System.out.println("Press 1 for LiveClock");
        System.out.println("Press 2 for Timer");
        System.out.println("Press 3 to quit");
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        
        while(true) {

            if (num == 1) {
                if (true) {
                    LiveClock LiveClock = new LiveClock();
                    System.out.println(LiveClock);

                }
            }
            if (num == 2) {
                if (true) {
                    Timer Timer = new Timer();
                    System.out.println(Timer);
                }
            }

            if (numk == 3) {
                break;

            }
        }

        }

        }
        
