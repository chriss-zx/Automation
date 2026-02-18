public class Metode {

    // metode void

    static void salut() {
        System.out.println("Salut");
    }

    static void patrat(double numar) {
        System.out.println(numar * numar);
    }

    static void suma(int x, int y) {
        System.out.println(x + y);
    }

    // metode return

    static int dubluNumar(int x) {
        return x * 2;
    }

    static boolean numarPar(int y) {
        if (y % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static int sumaN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }


    public static void main(String []args) {
 /*       salut();
        patrat(12.2);
        suma(14, 15);
        boolean rezultat = numarPar(14);
        System.out.println(rezultat);
        int n = 5;
        sumaN(n);
        System.out.println(sumaN(n));

  */
    }


}
