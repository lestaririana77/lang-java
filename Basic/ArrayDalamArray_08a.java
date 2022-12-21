public class ArrayDalamArray_08a {
    public static void main(String[] args) {

        String[][] members = {
                { "Riana", "Lestari" },
                { "Riri" },
                { "Ana" },
        };

        String[] member1 = members[0];
        System.out.println(member1[0]); // Riana

        System.out.println(members[1][0]); // Riri
        System.out.println(members[2][0]); // Ana
    }
}
