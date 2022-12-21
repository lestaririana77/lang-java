public class OperasiBoolean_11 {
    public static void main(String[] args) {

        // DAN (&&)
        // T && T = T
        // T && F = F
        // F && T = F
        // F && F = F

        // OR (||)
        // T || T = T
        // T || F = T
        // F || T = T
        // F || F = F

        // Kebalikan (!)
        // ! true = false
        // ! false = true

        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);
    }
}
