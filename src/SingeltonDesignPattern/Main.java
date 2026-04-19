package SingeltonDesignPattern;

public class Main {

    public static void main(String[] args) {

        Logger loggerInstance1 = Logger.getInstance();
        Logger loggerInstance2 = Logger.getInstance();
        Logger loggerInstance3 = Logger.getInstance();

        System.out.println("compare Instances");

        System.out.println(loggerInstance1 == loggerInstance2);
        System.out.println(loggerInstance3 == loggerInstance2);
        System.out.println(loggerInstance3 == loggerInstance1);

    }



}
