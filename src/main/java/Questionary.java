public class Questionary {
    public static final String title = "welcome";
    public static void main(String[] args) {
        System.out.println(title);
        sayHelloTo();
        System.out.println(monAge(new int[]{17, 48, 70, 72}));
    }
    private static void sayHelloTo(){
        System.out.println("hello " + "world");
    }

    private static int monAge (int[] ages){
        int acc = 0;
        int overall = 0;
        for (int age : ages){
            acc = acc + age;
        }
        overall = acc / ages.length;
        return overall;
    }
}
