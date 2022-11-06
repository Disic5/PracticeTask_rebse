package pattetn.singleton;

public class MainClass {
    public static void main(String[] args) {
           Singleton.getSingleton().addSomeMessage("first");
           Singleton.getSingleton().addSomeMessage("second");
           Singleton.getSingleton().addSomeMessage("tree");
           Singleton.getSingleton().addSomeMessage("four");
           Singleton.getSingleton().showMessage();
    }
}
