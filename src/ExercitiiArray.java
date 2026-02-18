public class ExercitiiArray {

    public static void main(String []args) {

        int[] scor = {2, 3, 5, 2, 4, 8, 10, 6};

        for (int i = 0; i < scor.length; i++) {
            System.out.print(scor[i] + " ");
        }

        System.out.println();

        int suma = 0;
        for (int i = 0; i < scor.length; i++) {
            suma = suma + scor[i];
        }
        System.out.println("Suma numerelor este: " + suma);

        int valMax = scor[0];
        for (int i = 0; i < scor.length; i++) {
            if (scor[i] > valMax) {
                valMax = scor[i];
            }
        }
        System.out.println("Valoarea maxima este: " + valMax);

        int counter = 0;
        for (int i = 0; i < scor.length; i++) {
            if (scor[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println("Numarul numerelor pare este: " + counter);

        System.out.println("Media numerelor este: " + suma / (scor.length - 1));
    }
}
