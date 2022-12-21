public class Method_Variable_Argument_24 {
    public static void main(String[] args) {

        int[] values = { 80, 80, 80, 80, 80 };
        sayCongrats("Riana", values);

        ucapan("Riri", 80, 90, 70, 30);
    }

    // tanpa argument
    static void sayCongrats(String name, int[] values) {

        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ". Anda belum Lulus");
        }
    }

    // Dengan variable Argument
    // tanpa argument
    static void ucapan(String name, int... values) {

        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ". Anda belum Lulus");
        }
    }
}
