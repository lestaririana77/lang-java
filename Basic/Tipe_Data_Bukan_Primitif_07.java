import javax.management.ValueExp;

public class Tipe_Data_Bukan_Primitif_07 {
    public static void main(String[] args) {

        // Tipe data primitif = tipe data bawaan dalam bahasa pemrograman
        // Tipe data primitif = number, char, boolean
        // Tipe data primitif selalu punya default Value
        // String bukan Tipe data primitif, tidak punya default value, bisa bernilai
        // null
        // Tipe data bukan primitif memiliki method / function

        // REPRESENTASI TIPE DATA PRIMITIF (1)
        // P BP
        // byte >> Byte
        // short >> Short
        // int >> Int
        // long >> Long
        // float >> Float
        // double >> Double
        // char >> Character
        // boolean >> Boolean

        // BUKAN PRIMITIF
        Integer iniInteger = 10;
        Long iniLong = 10L;
        Boolean iniBoolean = true;
        Short iniShort; // null
        iniShort = 100;

        System.out.println(iniShort);

        // Konversi P -> BP
        int age = 100;
        Integer ageObject = age;
        int ageAgain = ageObject;

        // ini konversi tapi nilainya gak kompatibel
        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
    }
}
