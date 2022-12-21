public class Switch_Statement_14 {
    public static void main(String[] args) {

        // Switch Statement lebih sederhana dari if statement

        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Anda Lulus dengan Nilai Terbaik");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;

            default:
                System.out.println("Mungkin Anda Salah Jurusan");
                break;
        }

        // Switch Lambda
        // Kalau pake lambda gak usah pake kata kunci break lagi

        var exam = "E";

        switch (exam) {
            case "A" -> System.out.println("Wow Anda Lulus dengan Baik");
            case "B", "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }

        // Kata kunci yield dipakai untuk mengembalikan nilai pada switch statement
        // Contoh2 di atas itu tanpa yield

        // Dengan yield
        var result = "A";

        String ucapan = switch (result) {
            case "A":
                yield "Anda Lulus dengan Nilai Terbaik";
            case "B", "C":
                yield "Anda Lulus";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Mungkin Anda Salah Jurusan";
        };
        System.out.println(ucapan);
    }
}
