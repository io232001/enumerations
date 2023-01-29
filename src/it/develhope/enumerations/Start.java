package it.develhope.enumerations;
public class Start {

    public static void main(String[] args) {
        enum Month {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
            JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
        }

        for (Month mounth : Month.values()) {
            if (mounth.name().endsWith("Y")) {
                System.out.println(mounth.name() + " ends with y");
            } else {
                System.out.println(mounth.name() + " doesn't end with y");
            }
        }
    }

}
