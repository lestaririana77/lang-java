class VicePresident extends Manager { // class child (turunan)

    // VicePresident(){
    //     super(null); // ini class child dari manager wajib mengakses constructor yang ada di class manager (super)
    // }

    VicePresident(String name){
        super(name, null); // kalau di class parent ada 2 parameter boleh akses salah satunya aja
    }

    // Method Overriding = method yang mendeklarasiin ulang method yg terdapat di parent ke child
    // semua nya harus sama dari return atau tidaknya, nama method nya dan parameternya harus sama
    // Yg boleh dibedakan hanya body dari isi si method
    void sayHello(String name){
        System.out.println("Hi " + name + ", My Name is VP " + this.name);
    }

}