package collections.exc3;

/**trzeba dodaæ import Objects*/
import java.util.Objects;

public class Employee {
         private final String name;
        private final String surname;

        public Employee(final String name,final String surname) {
                this.name = name;
                this.surname = surname;
        }



//        public static String getName() {
//                return name;
//        }
//
//        public static String getSurname() {
//                return surname;
//        }

        @Override
        public String toString() {
                return name+" "+surname;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                Employee employee = (Employee) o;

                if (!Objects.equals(name, employee.name)) return false;
                return Objects.equals(surname, employee.surname);
        }

        @Override
        public int hashCode() {
                int result = name != null ? name.hashCode() : 0;
                result = 31 * result + (surname != null ? surname.hashCode() : 0);
                return result;
        }
        //        @Override
//        public boolean equals(Object obj) {
//                return super.equals(obj);
//        }
//        @Override
//        public int hashCode() {
//                return Objects.hash(name,surname);
//        }




}
