package MikkelSorensen;

public class Time {


    // Deklarerer variabler
        public int time;
        public int minut;
        public int sekund;
        public long nTime;
        long tid;

        // Sætter min værdi til tiden siden 1. januar, 1970
        public Time(){
        nTime = System.currentTimeMillis();
        nTime = tid;
        }

        public Time(int ntime, int nminut, int nsekund){
            ntime = time;
            nminut = minut;
            nsekund = sekund;
        }

        // Omregner tiden til timer
        public int getTime(){
            return (int)(tid / (1000*60*60)) % 24;
        }

        // Omregner tiden til minutter
        public int getMinut () {
            return (int)(tid / (1000*60)) % 60;
        }

        // Omregner tiden til sekunderq
        public int getSekund() {
            return (int) (tid / 1000) % 60;
        }

    }





