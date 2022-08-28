package optional.exc5;

import java.util.Optional;

public class User {
        private int id;
        private String name;
        private String surname;

        public User() {
                this.id = 0;
                this.name = "Default";
                this.surname = "Default";
        }
        public User(int id, String name, String surname) {
                this.id = id;
                this.name = name;
                this.surname = surname;
        }

        public int getId() {
                return id;
        }

        public String getName() {
                return name;
        }

        public String getSurname() {
                return surname;
        }


        @Override
        public String toString() {
                return "User{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        '}';
        }
}
