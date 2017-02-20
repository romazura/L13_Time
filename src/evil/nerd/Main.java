package evil.nerd;


public class Main {

    public static void main(String[] args) {
        Time time = new Time();
        
        time.setTime(14,13,56);
        System.out.println(time.toMilitary());
        System.out.println(time.toNormal());
    }
}
