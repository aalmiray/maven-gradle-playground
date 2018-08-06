package sample;

public class Env {
    public String env() {
        return "hello - " + Version.VERSION;
    }

    public static void main(String[] args) {
        System.out.println(new Env().env());
    }
}
