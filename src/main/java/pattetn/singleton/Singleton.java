package pattetn.singleton;

public class Singleton {

    private static Singleton singleton;
    private static String somemessage = "LOG file \n";

    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private Singleton() {
    }

    public void addSomeMessage(String str) {
        somemessage += str + "\n";
    }

    public void showMessage() {
        System.out.println(somemessage);
    }
}
