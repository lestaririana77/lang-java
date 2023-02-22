package Todolist;

public class AplikasiTodoList {
    
    public static String[] model = new String[10];  // jadi karna mau bikin data todolist nya sederhana, jadi pakai array nah nanti kalau todo listnya udah lebih dari 10 harus ubah modelnya lagi dinaikin angkanya

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        viewShowTodoList();
    }

    // Menampilkan todo list
    public static void showTodoList(){
        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++){
            var todo = model[i];
            var no = i + 1; // di array iterasi dimulai dari nol, makanya di + 1 biar nomor list nya dimulai dari 1

            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    // Test Menampilkan todolist
    public static void testShowTodoList(){
        model[0] = "Belajar java dasar";
        model[1] = "Studi Kasus Java Dasar: Aplikasi Todo List";
        showTodoList();
    }

    // Menambah todo ke list
    // karena di add cuma nambahin teks jadi kita tambahin parameter todonya
    public static void addTodoList(String todo){

        // cek apakah model penuh?
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null){
                // model masih ada yg kosong
                isFull = false;
                break;
            }
        }

        // Jika penuh kita resize ukuran data array 2x lipat
        if(isFull){
            var temp = model;
            model = new String[model.length * 2]; // gak bisa hanya di set seperti ini karena nanti kalau penuh data model akan tereset semua karena membuat data model baru

            for (int i = 0; i < temp.length; i++) {
                model[1] = temp[i];
            }
        }

        // tambahin ke posisi yg data arraynya null
        for (var i = 0; i < model.length; i++){
            if (model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    // testing add todo list
    public static void testAddTodoList(){
        for (int i = 0; i < 25; i++) { // mau cek apakah setelah di resize datanya masih ada atau tidak
            addTodoList("Contoh Todo Ke-" + i);
        }
        showTodoList();
    }

    // Menghapus todo dari list
    public static boolean removeTodoList(Integer number){ // jadi method nya dibikin boolean bukan void untuk mengecek return dari remove apakah sukses atau gagal
        if ((number - 1) >= model.length){
            return false;
        } else if (model[number - 1] == null){
            return false;
        } else {
           // model[number - 1] = null;
            for (int i = (number - 1); i < model.length; i++) {
                if(i == (model.length - 1)){
                    model[i] = null;
                }else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    // Testing remove todo list
    public static void testRemoveTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(7);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    // Input
    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        var name = input("Nama");
        System.out.println("Hi, " + name);

        var channel = input("Channel");
        System.out.println(channel);
    }

    // Menampilkan view todo list
    public static void viewShowTodoList(){
        while (true){
            showTodoList();

        System.out.println("Menu :");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("x. Keluar");

        var input = input("Pilih");
        if(input.equals("1")){
            viewAddTodoList();
        } else if (input.equals("2")){
            viewRemoveTodoList();
        } else if (input.equals("x")){
            break;
        } else {
            System.out.println("Pilhan tidak dimengerti");
        }
        }
    }

    //Testing view show todo list
    public static void testViewShowTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");
        viewShowTodoList();
    }

    // Menampilkan view menambahkan todo list
    public static void viewAddTodoList(){
        System.out.println("MENAMBAH TODOLIST");

        var todo = input("Todo (x jika Batal)");

        if (todo.equals("x")){
            // batal
        } else {
            addTodoList(todo);
        }
    }

    public static void testViewAddTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");

        viewAddTodoList();

        showTodoList();
    }

    // Menampilkan view menghapus todo list
    public static void viewRemoveTodoList(){
        System.out.println("MENGHAPUS TODOLIST");

        var number = input("Nomor yang dihapus (x jika Batal)");

        if (number.equals("x")){
            // batal
        } else {
            boolean success = removeTodoList(Integer.valueOf(number)); // mengubah sring jadi number
            if(!success){
                System.out.println("Gagal menghapus todolist : " + number);
            }
        }
    }

    public static void testViewRemoveTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");

        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }
}

// saat mau membuat suatu project langkah pertama yaitu buat dulu prototype nya
// 1. prototype = dasar dalam melakukan projet,
// implementasinya seperti mau buat apa, flow nya bagaimana, apa saja data nya, dll
// 2. kemudian buat modelnya --> buat main class, kemudian bikin data array
// karna bikin todolistnya sederhana jadi representating datanya cukup pake array
// 3. menentukan business logic
// buat method untuk show todolist,
// buat logic untuk menambah todolist,
// membuat logic untuk menghapus todolist
// 4. menentukan view (tampilan) >> buat methodnya
// halaman utama menampilkan todo list (view todolist),
// tampilan menambahkan (view add),
// tampilan menghapus (view remove/delete)
// 5. Setiap melakukan business logic jangan lupa implementasi testingnya
// untuk memastikan business logic yg sudah dibuat tidak ada masalah
// 6. Di add todo list
// tidak hanya membuat perulangan untuk data todo nya kita juga perlu memerhartikan size dari model length nya,
// kalau dia full berarti harus di resize model length nya dan tidak lupa menambahkan temporari length agar data todo sebelumnya tidak hilang saat di resize

