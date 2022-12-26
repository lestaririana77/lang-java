class Person {
    String name;
    String address;
    final String country = "Indonesia";
    // adex test

    // Constructor = method yg akan dipanggil pertama kali Object dibuat
    // Nama constructor harus sama dengan nama class
    // constructor tidak butuh kata kunci void / return value
    // Nuat ngeset data (maksa orang) supaya data tersetting sesuai constructor
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    };

    // Constructor Overloading
    Person(String paramName) {
        // name = paramName; atau..
        this(paramName, null); // disini pake this karena manggil dari constructor pertama..
    };

    Person() {
        this(null);
    };

    // Menambahkan Method ke Dalam Class
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name is " + name);

    }
}