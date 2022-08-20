package collections.exc3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** Napisz program, kt�ry stworzy Set z elementami klasy Employee. Employee posiada imi� i nazwisko.
         Dodaj do Seta kilku pracownik�w, o tym samym imieniu i nazwisku bez nadpisywania metody
         hashCode(), potem zr�b to samo z nadpisan� metod� hashCode(). Jaka jest r�nica?*/
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
