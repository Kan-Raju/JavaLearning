import package1.Student;

public class Main {

    static {
        System.out.println("Kvln raju");
    }

    private static String name = "surya";

    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(Main.name);
        System.out.println(Student.name);
    }
}