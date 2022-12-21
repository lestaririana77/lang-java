public class Break_dan_Continue_19 {
    public static void main(String[] args) {

        // Kalau break menghentikan seluruh perulangan
        // kalau continue, menghentikan perulangan saat ini dan melanjutkannya ke
        // perulangan selanjutnya

        {
            var counter = 1;
            while (true) {
                System.out.println("Perulangan Ke-" + counter);
                counter++;

                if (counter > 10) {
                    break;
                }
            }
        }

        {
            // Continue
            for (int counter = 1; counter <= 100; counter++) {
                if (counter % 2 == 0) {
                    continue;
                }
                System.out.println("Perulangan Ganjil-" + counter);
            }
        }
    }
}
