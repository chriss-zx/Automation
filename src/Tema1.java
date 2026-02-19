public class Tema1 {

    // 6. Creează o metodă care afișează: “Invat Java!”

    static void java() {
        System.out.println("Invat Java.");
    }

    // 7. Creaza o metoda cu 2 parametrii int, care returneaza produsul celor doi parametrii.

    static int produs(int x, int y) {
        return x * y;
    }

    // 8. Calculează suma numerelor pare de la 1 la 50. Crează o metoda care returneaza rezultatul.

    static int sumaPar(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }

        return sum;
    }

    // 9. Creaza o metoda cu 3 parametrii. Returneaza media celor trei parametrii.

    static int media(int x, int y, int z) {
        int sum = (x + y + z) / 3;

        return sum;
    }

    // 10. Creeaza o metoda care primeste 2 parametrii: start si end. Afiseaza toate numerele cuprinse intre aceste doua numere

    static void allNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        // 1. Creează variabile pentru: varsta unui student, inaltimea acestuia, daca este prezent la curs. Afiseaza datele prin mesaje/propozitii.
        int age = 22;
        int height = 190;
        boolean present = true;

        System.out.println("Andrei are " + age + " de ani.");
        System.out.println("Inaltimea sa este " + height + " cm.");
        System.out.println("A fost prezent la curs? " + present);


        // 2. Crează doua variabile int si una double. Calculeaza suma celor doua valori int. Calculeaza media dintre toate 3.

        int a = 27;
        int b = 36;
        double c = 15.36;

        System.out.println("Suma celor 2 numere intregi este: " + (a + b));
        System.out.println("Media celor 3 numere este: " + ((a + b + c) / 3));


        // 3. Creaza o variabila pentru varsta. Dacă persoana are 18 sau mai mult, afișează: “Acces permis”, altfel “Acces interzis”.

            // am luat variabila varsta de la primul exercitiu.

        if (age >= 18) {
            System.out.println("Acces permis");
        } else {
            System.out.println("Acces interzis");
        }


        // 4. Calculeaza suma numerelor de la 20 la 50.

        int n = 50;
        int sum = 0;
        for (int i = 20; i <= n; i++)
            sum = sum + i;

        System.out.println("Suma numerelor de la 20 la 50 este: " + sum);


        // 5. Afișează numerele de la 10 la 1 folosind while.

        int i = 10;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }

        System.out.println();

        java();
        System.out.println("Produsul celor 2 numere este: " + produs(5, 5));

        System.out.println(sumaPar(50));
        System.out.println(media(361278, 2675, 162753));

        allNumbers(-12, 27);

    }
}
