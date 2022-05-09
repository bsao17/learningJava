public class Questionary {
    public static String title = "welcome";
    public static void main(String[] args) {
        System.out.println(title);
        sayHelloTo("world");
    }

    private static void sayHelloTo(String recipe){
        System.out.println("hello " + recipe);
    }
}
