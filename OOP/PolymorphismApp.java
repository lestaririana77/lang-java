public class PolymorphismApp {
    // Polymorphisme = perubahan bentuk dari satu bentuk ke bentuk lain
    // Erat kaintannya dengan sifat pewarisan
    public static void main(String[] args) {
     
        
        Employee employee = new Employee("Ana");
        employee.sayHello("Riri");

        employee = new Manager("Ana");
        employee.sayHello("Riri");

        employee = new VicePresident("Ana");
        employee.sayHello("Riri");

        sayHello(new Employee("Riana"));
        sayHello(new Manager("Ana"));
        sayHello(new VicePresident("nana"));
    }
    
    // contoh yg lain polymorphisme bisa di set di dalam parameter yg ada di dalam method

    static void sayHello(Employee employee){ //kalau tidak pakai polymorphysme harus bikin static ini sebanyak jumlah turunannya kalau mau manggil turunannya
        System.out.println("Hello " + employee.name); // kalau pakai polymorphysme cukup pakai kelas parentnya saja
    }
    
}
// TYPE CHECK & CASTS
// Sebelumnya kita sudah tau cara melakukan konversi tipe data (casts) di tipe data primitif
// Casts juga bisa digunakan untuk tipe data bukan primitif
// Namun agar aman, sebelum melakukan casts, pastikan kita melakukan type check (pengecekan tipe data), dengan menggunakan kata kunci instanceof
// Hasil operator instanceof adalah boolean, true jika tipe data sesuai, false jika tidak sesuai
