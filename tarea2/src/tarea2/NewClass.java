
package tarea2;



/**
 *
 * @author desktop
 */
public class NewClass {

    public static String espacios(int x) {
        String s = "";
        for (int i = 0; i <= x; i++) {
            s = s + i + "___";
        }
        return s;
    }

    public static void main(String[] args) {

        int[] v = {10, 55, 6, 7, 3, 2, 77};

        for (int i = 0; i < v.length; i++) {
            System.out.println(espacios(i) + v[i]);            
        }

        /*for (int i = 2; i <= 10; i = i + 2) {
            System.out.println(i);
        }*/

        System.out.println();
    }
}
