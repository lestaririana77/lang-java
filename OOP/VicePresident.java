class VicePresident extends Manager { // class child (turunan)

    // Method Overriding = method yang mendeklarasiin ulang method yg terdapat di parent ke child
    // semua nya harus sama dari return atau tidaknya, nama method nya dan parameternya harus sama
    // Yg boleh dibedakan hanya body dari isi si method
    void sayHello(String name){
        System.out.println("Hi " + name + ", My Name is VP " + this.name);
    }

}