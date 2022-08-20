package collections.exc3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** Napisz program, który stworzy Set z elementami klasy Employee. Employee posiada imiê i nazwisko.
         Dodaj do Seta kilku pracowników, o tym samym imieniu i nazwisku bez nadpisywania metody
         hashCode(), potem zrób to samo z nadpisan¹ metod¹ hashCode(). Jaka jest ró¿nica?*/
public class Main {
        public static void main(String[] args) {
//                Employee employee1= new Employee  ("Jan","Kowalski");
//                Employee employee2= new Employee  ("Jan","Kowalski");
//                Employee employee3= new Employee  ("Jan","Kowalski");
//                Employee employee4= new Employee  ("Jan","Kowalski");

/**metoda z nadpisanym hashcodem i nadpisanym equals*/
                Set<Employee> employees = new HashSet<>();
                employees.add(new Employee  ("Jan","Kowalski"));
                employees.add(new Employee  ("Jan","Kowalski"));
                employees.add(new Employee  ("Jan","Kowalski"));
                employees.add(new Employee  ("Jan","Kowalski"));
                for (Employee employee : employees) {
                        System.out.println(employee.hashCode());
                        System.out.println(employee);
                }

/**metoda z nienadpisanym hashcodem*/
                Set<Employee2> employees2 = new HashSet<>();
                employees2.add(new Employee2  ("Jan2","Kowalski"));
                employees2.add(new Employee2  ("Jan2","Kowalski"));
                employees2.add(new Employee2  ("Jan2","Kowalski"));
                employees2.add(new Employee2  ("Jan2","Kowalski"));
                for (Employee2 employee : employees2) {
                        System.out.println(employee.hashCode());
                        System.out.println(employee);
                }

        }
}
