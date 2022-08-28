package optional.exc4;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Optional;


/**Stwórz klasê User, która bêdzie zawiera³a pola id, name, surname. Zdefiniuj metodê
 findUserByName(String name), która zwróci Optional. Nastêpnie wykonaj map() na name. Zrób filtr(),
 czy name tego usera zaczyna siê od 'G'. Je¿eli taki user nie istnieje wyrzuæ wyj¹tek*/
public class Main {
        public static void main(String[] args) {

        Main main = new Main();
        main.excrun();


        }

        private void excrun() {
                Optional<User> user = findUserByName("Marek");
                Optional <String> name = user.map(u -> u.getName());
                Optional <String> filtered = name.filter(n -> n.startsWith("M"));
                filtered.orElseThrow(()->new RuntimeException("not exists"));
        }

        Optional <User> findUserByName(String name) {
                if(name.equals("Marek")){
                        return Optional.of(new User(1,"Marek","Kot"));
                } else {
                        return Optional.empty();
                }
        }
}
