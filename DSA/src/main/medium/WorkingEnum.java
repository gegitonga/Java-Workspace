package main.medium;

public class WorkingEnum {
    public enum Day {
        MONDAY,TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public void setAlarm(Day day){
        if(day == Day.SATURDAY || day == Day.SUNDAY){
            System.out.println("Weekend: No Alarm");
        }else{
            System.out.println("Setting alarm for 7 am");
        }
    }


    public enum Planet{
        MERCURY (3.30, 2.4),
        VENUS (4.869e+24, 6.0518e6),
        EARTH (5.976e+24, 6.37814e6),
        MARS (6.421e+23, 3.3972e6),;

        private final double mass;
        private final double radius;

        Planet(double mass, double radius){
            this.mass = mass;
            this.radius = radius;
        }

        public double getMass(){
            return mass;
        }
        public double getRadius(){
            return radius;
        }

        public double surfaceGravity(){
            final double G = 6.67300E-11;
            return G * mass / (radius * radius);
        }


    }

}
