class Manager extends Employee{ // class parent => menjadi class child nya Employee

    // String name; ==> ini di hapus, gak perlu karna name nya sudah ada di employee
    String company;

    Manager(String name) {
        // this.name = name; // ini constructor
        super(name);
    }

    Manager(String name, String company) {
        // this.name = name;
        super(name);
        this.company = company;
    }

    // Manager(){
        // ini kalau kosong namanya default constructor
        // jadi di class child nya gak wajib akses constructor ini
        // karna nanti di class child nya otomatis mengakses ini
    // }

    // super selain bisa untuk method dan field dia juga bisa buat akses constructor
    // namun syaratnya untuk mengakses parent class constructor, kita harus mengaksesnya di dalam class child constructor
    /* jika sebuah class parent tidak punya constructor yg tidak ada parameternya (tidak memiliki default constuctor), 
    maka class child wajib mengakses constuctor parent tersebut */

    void sayHello(String name){
        System.out.println("Hi " + name + ", My Name is Manager " + this.name);
    }
}