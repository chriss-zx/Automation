public class ExercitiiMetode {

    static void inmultire(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print(i * 7 + " ");
        }
    }

    static void multiplu(int nr) {
        for (int i = 100; i <= 1000; i++) {
            if (i % nr == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    static String numeVarsta (String nume, int varsta) {
        return nume + " are " + varsta + " de ani.";
    }

   static int plus (int x, int y) {
        return x + y;
   }
   static int minus (int z, int w) {
        return z - w;
   }

   static void interval(int limitaInf, int limitaSup) {
        for (int i = limitaInf; i <= limitaSup; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
   }

   static void factorial(int n) {
        int produs = 1;
        for (int i = 1; i <= n; i++) {
            produs = produs * i;
        }
       System.out.println(produs);
   }

    static boolean nrPrim (int p) {
        if (p <= 1) {
            return false;
        }
        if (p == 2) {
            return true;
        }
        if (p % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= p; i += 2) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void sumaPar (int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
            sum = sum + i;
            }
        }
                System.out.println("Suma este: " + sum);
    }

    static void nrPutere (int b, int e) {
        int rezultat = 1;
        for (int i = 1; i <= e; i++) {
        rezultat = rezultat * b;
        }
            System.out.println("Rezultatul este: " + rezultat);
    }


    static void triunghi(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String []args) {
/*        inmultire(10);
        multiplu(7);
        String nume = "Cristi";
        int varsta = 24;
        System.out.println(numeVarsta(nume, varsta));
        System.out.println(plus(2, 3));
        System.out.println(minus(10, 7));
        interval(5, 15);
        factorial(9);
        System.out.println(nrPrim(11));
        sumaPar(11);
        nrPutere(3, 3);
 */
        triunghi(3);
    }
}