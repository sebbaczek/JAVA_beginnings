import java.util.Arrays;

/** Zamie� wszystkie s�owa w tablicy tak aby by�y one w ca�o�ci napisane z wielkiej litery, natomiast
 reszta literek by�a ju� ma�� liter�. Postaraj si� nie tworzy� �adnych nowych tablic opr�cz tej, kt�ra
 zawiera dane wej�ciowe*/
public class CaseSwitcher {
    public static void main(String[] args) {
    String[] arr = {"SebastiaN", "kot", "TRAktor", "SaMoch�D"};
        switchCase (arr);
//    String[] result = switchCase (arr);
//        System.out.println(Arrays.toString(result));
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
