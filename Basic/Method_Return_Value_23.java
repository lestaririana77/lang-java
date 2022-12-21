public class Method_Return_Value_23 {
    public static void main(String[] args) {

        var a = 100;
        var b = 200;
        var c = sum(a, b);

        System.out.println(c);

        var result1 = sum(100, 100);
        System.out.println(result1);

        System.out.println(sum(100, 300));
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }
}
