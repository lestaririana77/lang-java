public class For_Loop_16 {
    public static void main(String[] args) {

        // For Loop (Perulangan)
        // sintak :
        // for(init statement; kondisi; post statement){
        // blok perulangan
        // }

        // for (;;) {
        // System.out.println("Perulangan");
        // } // ini perulangan yg tidak akan berhenti-berhenti

        // var counter = 1;

        // for (; counter <= 10;) {
        // System.out.println("Perulangan Ke-" + counter);
        // counter++;
        // }

        // Perulangan dengan init statement
        for (var counter = 1; counter <= 10;) {
            System.out.println("Perulangan Ke-" + counter);
            counter++;
        }

        // Perulangan dengan post statement
        for (var counter = 1; counter <= 10; counter++) {
            System.out.println("Perulangan Ke-" + counter);
        }
    }
}
