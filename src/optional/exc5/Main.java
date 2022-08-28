package optional.exc5;



import java.util.Optional;

/**
 * Stwórz klasê User, która bêdzie zawiera³a pola id, name, surname. Zdefiniuj metodê
 * findUserByName(String name), która zwróci Optional. Wywo³aj tê metodê. Nastêpnie, je¿eli taki user
 * nie istnieje, zwróæ w optionalu defaultow¹ definicjê Usera (stwórz jakiœ konstruktor domyœlny).
 * Je¿eli User istnieje, to wydrukuj to na ekranie
 */
public class Main {
        public static void main(String[] args) {
                Main main = new Main();
                main.excrun();


        }

        private void excrun() {
                Optional<User> user = findUserByName("Marek");
                Optional<User> or = user.or(() -> Optional.of(new User()));
                        or.ifPresent(u-> System.out.println("user exists"));
        }

        Optional<User> findUserByName(String name) {
                if(name.equals("Marek")){
                        return Optional.of(new User(1,"Marek","Kot"));
                } else {
                        return Optional.empty();
                }
        }
}
