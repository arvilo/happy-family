public class Main {
    public static void main(String[] args) {
        String[] a = new String[1];
        a[0] = "JJ";

        StringBuilder arrayString = new StringBuilder();
        arrayString.append("[");
        boolean comma = false;
        for(String i: a) {
            if (comma) arrayString.append(",");
            arrayString.append(i);
            comma = true;
        }
        arrayString.append("]");

        System.out.println(arrayString);
    }
}