package MikkelSorensen;
public class TimeTester {
    public static void main(String[] args) {

        Time time = new Time();
        Time time2 = new Time();
        System.out.printf("",
                time2.getTime(),
                time2.getMinut(),
                time2.getSekund());

        System.out.printf("%d:%d:%d%n%n",
                time.getTime(),
                time.getMinut(),
                time.getSekund());

        Time.setTime = 2432423534L;
        System.out.printf("%d:%d:%d%n%n",
                time2.getTime(),
                time2.getMinut(),
                time2.getSekund());
    }
    }

