public class ExercitiiWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        int x = 10;
        while (x >= 1) {
            System.out.print(x + " ");
            x--;
        }

        System.out.println();

        int y = 1;
        while (y <= 30) {
            if (y % 3 == 0) {
                System.out.print(y + " ");
            }
            y++;
        }

        System.out.println();

        int z = 1;
        int sum = 0;
        while (z <= 5) {
            sum = sum + z;
            z++;
        }
        System.out.print("Suma este: " + sum);
    }
}