public class Main {
    public static void main(String[] args) {
        System.out.println("5fe , 8inch = " + convertIntoCentimeters(5,8) + "cm");
        System.out.println("68inch = " + convertIntoCentimeters(68) + "cm");
        convertIntoCentimeters();
        System.out.println("abdul malik");

    }

    public static double convertIntoCentimeters(int inches){
        return inches*2.54;
    }

    public static double convertIntoCentimeters(int feet, int inches){
        return ((feet*12)+ inches)*2.54;
    }
    public static void convertIntoCentimeters(){
        System.out.println("change the mood of your life");
    }

}
