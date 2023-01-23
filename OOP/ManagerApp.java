public class ManagerApp {
    public static void main(String[] args) {


        var manager = new Manager("Riri");
        manager.sayHello("Riri");

        var vp = new VicePresident("Adek");
        vp.sayHello("Riri");


        // jadi sebenernya java itu punya class object yg ada di puncak hirarki
        // object class = superclass
        // di class object sudah ada kode2 tersendiri yg bisa di akses di class di bawahnya (method2 bawaan dari object)

        System.out.println(manager);
        System.out.println(manager.toString()); // "Manager" + @ + kode hexa to string
        System.out.println(vp);
        System.out.println(vp.toString()); // "VicePresident" + @ + kode hexa to string
    }
}