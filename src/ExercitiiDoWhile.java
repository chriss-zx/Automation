public class ExercitiiDoWhile {
    public static void main(String []args) {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);

        System.out.println();

        int x = 10;
        do {
            System.out.print(x + " ");
            x--;
        } while (x >= 1);

        System.out.println();

        int z = 1;
        int sum = 0;
        do {
            sum = sum + z;
            z++;
        } while (z <= 5);
        System.out.print("Suma este: " + sum);
    }

}
