public class ExercitiiString {

    public static void main(String []args) {
        String text = "Ana are 7 mere verzi.";

        System.out.println("Lungimea este: " + text.length());

        String cuvant = "catel";
        System.out.println("Prima litera este: " + cuvant.charAt(0));
        System.out.println("Ultima litera este: " + cuvant.charAt(cuvant.length() - 1));

        boolean equals = text.equals(cuvant);
        System.out.println(equals);

        System.out.println("Contine cuvant: " + text.contains(cuvant));

        String noulText = text.replace(" ", "");
        System.out.println("Inlocuire spatii: " + noulText);


        String caise = text.replace("mere", "caise");
        System.out.println(caise);


    }
}
