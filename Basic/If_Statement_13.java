public class If_Statement_13 {
    public static void main(String[] args) {

        var nilai = 70;
        var absen = 90;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Silahkan Mencoba Lagi Tahun Depan");
        }

        // ELSE IF
        var finalExam = 70;

        if (finalExam >= 96) {
            System.out.println("A");
        } else if (finalExam >= 80) {
            System.out.println("B");
        } else if (finalExam >= 70) {
            System.out.println("C");
        } else if (finalExam >= 50) {
            System.out.println("D");
        } else {
            System.out.println("Silahkan Coba Lagi Tahun Depan");
        }
    }
}
