public class ManagerApp {
    public static void main(String[] args) {


        var manager = new Manager("Riri");
        manager.sayHello("Riri");

        var vp = new VicePresident("Adek");
        vp.sayHello("Riri");
    }
}