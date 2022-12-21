public class Tipe_Data_Array_08 {
    public static void main(String[] args) {

        String[] arrayString; // atau String[] arrayString = new String[3];
        arrayString = new String[3];
        arrayString[0] = "Riana";
        arrayString[1] = "Riri";
        arrayString[2] = "Lestari";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[0] = "Ana"; // mengubah data array
        System.out.println(arrayString[0]);

        // Kode Array Iniitializer
        int[] arrayInt = new int[] {
                10, 90, 80, 67, 29
        };
        long[] arrayLong = {
                10, 90, 80, 67, 29
        };

        // array[index] : mengambil data di array
        // array[index] = value : mengubah data array
        // array.length : mengambil panjang array

        System.out.println(arrayLong.length);
    }
}
