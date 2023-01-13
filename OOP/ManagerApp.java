public class ManagerApp {
    public static void main(String[] args) {


        var manager = new Manager();
        manager.name = "Riana";
        manager.sayHello("Riri");

        var vp = new VicePresident();
        vp.name = "Adek";
        vp.sayHello("Riri");
    }
}