public class Method_Overloading_25 {
    public static void main(String[] args) {

        sayHello();
        sayhello("Riana");
        sayHello("Riana", "Lestari");
    }
    // Method Overloading = bikin method dengan nama yg sama berkali2, tapi harus
    // beda jml parameter dan tipe data

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayhello(String firstName) {
        System.out.println("Hello " + firstName);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
