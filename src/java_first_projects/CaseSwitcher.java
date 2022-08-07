package java_first_projects;

import java.util.Arrays;

/** Zamieñ wszystkie s³owa w tablicy tak aby by³y one w ca³oœci napisane z wielkiej litery, natomiast
 reszta literek by³a ju¿ ma³¹ liter¹. Postaraj siê nie tworzyæ ¿adnych nowych tablic oprócz tej, która
 zawiera dane wejœciowe*/
public class CaseSwitcher {
    public static void main(String[] args) {
    String[] arr = {"SebastiaN", "kot", "TRAktor", "SaMochóD"};
        switchCase (arr);
        /**metoda z replaceFirst - zamienia pierwsze wyst¹pienie wskazane w tej funkcji*/
        switchCase2 (arr);
//    String[] result = switchCase (arr);
//        System.out.println(Arrays.toString(result));
    }

    private static void switchCase2(String[] arr) {
        for (int s = 0; s < arr.length; s++) {
            String newword = arr[s].toLowerCase();
            newword = newword.replaceFirst(
                    String.valueOf(newword.charAt(0)),
                    String.valueOf(newword.charAt(0)).toUpperCase()
            );
            arr[s] = newword;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static String[] switchCase(String[] arr) {

        for (int i = 0; i < arr.length; i++) {

           String s = arr[i].toLowerCase();
           String d = s.substring(0,1).toUpperCase();
            String e = s.substring(1,s.length());
            s = d+e;
            arr[i] = s;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

}
