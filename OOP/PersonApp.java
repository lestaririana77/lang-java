public class PersonApp {
    public static void main(String[] args) {

        // Field seperti variable, tapi ditempatkan di block class

        // manipulasi field

        var person1 = new Person("Riana", "Jakarta");
        // person1.name = "Riana"; >>> tidak dibutuhkan lagi
        // person1.address = "Jakarta";
        // // person1.country = "UK"; Tidak bisa diubah karna data konstan

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Riri");

        Person person2 = new Person("Riri", "Bali");
        Person person3;
        person3 = new Person("Ana", "Yogyakarta");
        // person3.name = "Ana"; tidak butuh lagi karna sudah ditambahkan parameter

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        person3.sayHello("Riri");

    }
}
