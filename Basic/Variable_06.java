public class Variable_06 {
    public static void main(String[] args) {

        // Di java variable hanya bisa digunakan 1 tipe data saja, berbeda dgn
        // javascript dan php
        String nama;
        nama = "Riana Lestari";

        int age = 22;
        String address = "Indonesia";

        System.out.println(nama);
        System.out.println(age);
        System.out.println(address);

        // Kata Kunci Var = digunakan sejak java 10, jadi bisa pake kata kunci ini tanpa
        // sebutin tipe data apa sebelum variable, tapi harus langsung diikuti dgn value
        // / nilai
        // var nama; // ERROR
        var name = "Riana Lestari";
        var umur = 22;
        var alamat = "Indonesia";

        System.out.println(name);
        System.out.println(umur);
        System.out.println(alamat);

        // Kata Kunci Final = dipakai kalau ada data yg tidak ingin bisa diubah2 value
        // nya (konstan)
        final String fullName = "Riana Lestari";
        var usia = 22;
        var domisili = "Jakarta";

        // fullName = "Riri"; // ERROR, karna value nya konstan tidak bisa diubah

        System.out.println(fullName);
        System.out.println(usia);
        System.out.println(domisili);

    }
}
