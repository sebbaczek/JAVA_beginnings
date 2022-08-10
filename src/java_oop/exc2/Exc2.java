package java_oop.exc2;

/**
 * Napisz interface Function, w którym zdefiniujesz metodę calculate(), która przyjmie jako parametr int i zwróci int. Następnie napisz klasę HalfCalculator, która będzie implementowała ten interface, a metoda calculate() będzie dzieliła podany argument na 2. Napisz też klasę QuarterCalculator, która będzie implementowała ten interface, a metoda calculate() będzie dzieliła podany argument na 4. Wywołaj tę metodę, stosując polimorfizm, to znaczy, stwórz 2 obiekty, których referencje będą zadeklarowane jako Function. Następnie wydrukuj na ekranie wynik dla kilku podanych przykładów. Zrób ponownie to samo, tylko tym razem, zastąp interface Function klasą o nazwie FunctionClass.
 * Później stwórz tablicę na 10 elementów, gdzie tablica będzie typu Function i dodaj do niej obiekty na przemian HalfCalculator i QuarterCalculator. Przechodząc przez wszystkie elementy tablicy, wywołaj metodę calculate() na wyniku poprzednim i dodawaj do siebie kolejne otrzymane wyniki zaczynając od jakiejś dużej liczby, np 12642364. Wynik wydrukuj na ekranie
 */

public class Exc2 {
        public static void main(String[] args) {

                Function half = new HalfCalculator();
                Function half2 = new HalfCalculator();
                Function half3 = new HalfCalculator();
                Function half4 = new HalfCalculator();
                Function half5 = new HalfCalculator();
                System.out.println(half.calculate(20));
                Function quarter = new QuarterCalculator();
                Function quarter2 = new QuarterCalculator();
                Function quarter3 = new QuarterCalculator();
                Function quarter4 = new QuarterCalculator();
                Function quarter5 = new QuarterCalculator();
                System.out.println(quarter.calculate(20));

                FunctionClass half1 = new HalfCalculator();
                System.out.println(half1.calculate(20));
                FunctionClass quarter1 = new QuarterCalculator();
                System.out.println(quarter1.calculate(20));

                Function[] table = new Function[10];
                table = new Function[]{half, quarter, half2, quarter2, half3, quarter3, half4, quarter4, half5, quarter5};
                int res = 12642364;
//                int sum = 0;
//                for (int i = 0; i < table.length; i++) {
//                        res = table[i].calculate(res);
//                        sum += res;
//                }

                for (int i = 0; i < table.length; i++) {
                        res += table[i].calculate(res);
                }
                System.out.println(res);

                /**metoda 2. pokazana na klasie FunctionClass*/
                FunctionClass[] table2 = new FunctionClass[10];
                for (int i = 0; i < table2.length; i++) {
                        table2[i] =
                                i % 2 == 0 ?
                                        new HalfCalculator() : new QuarterCalculator();
                }

                int res2 = 12642364;
                for (FunctionClass el : table2) {
                        res2 += el.calculate(res2);
                }
                System.out.println(res2);
        }
}
