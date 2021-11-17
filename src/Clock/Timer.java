package Clock;

public class Timer {
        private int value;
        private int max;

        public Timer(int max) {
            this.max = max;
            this.value = 0;
        }

    public void next() {
            this.value = this.value + 1;

            if (this.value >= this.max) {
                this.value = 0;
            }
        }

        public int value() {
            return this.value;
        }

        public String toString() {
            if (this.value < 10) {
                return "0" + this.value;
            }

            return "" + this.value;
        }

        public static void main(String[] args) {


            Timer hours = new Timer(24);
            Timer minutes = new Timer(60);
            Timer seconds = new Timer(60);
            Timer milliseconds = new Timer(60);

            while (true) {


                System.out.println(hours + ":" + minutes + ":" + seconds + ":" + milliseconds);


                milliseconds.next();

                if (milliseconds.value() == 0) {
                    seconds.next();

                    if (seconds.value() == 0) {
                        minutes.next();

                        if (minutes.value() == 0) {
                            hours.next();
                        }
                    }
                }


                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }
    public Timer() {
        Timer hours = new Timer(24);
        Timer minutes = new Timer(60);
        Timer seconds = new Timer(60);
        Timer milliseconds = new Timer(60);

        while (true) {


            System.out.println(hours + ":" + minutes + ":" + seconds + ":" + milliseconds);


            milliseconds.next();

            if (milliseconds.value() == 0) {
                seconds.next();

                if (seconds.value() == 0) {
                    minutes.next();

                    if (minutes.value() == 0) {
                        hours.next();
                    }
                }
            }


            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    }
