package optional.exc4;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Optional;


/**Stw�rz klas� User, kt�ra b�dzie zawiera�a pola id, name, surname. Zdefiniuj metod�
 findUserByName(String name), kt�ra zwr�ci Optional. Nast�pnie wykonaj map() na name. Zr�b filtr(),
 czy name tego usera zaczyna si� od 'G'. Je�eli taki user nie istnieje wyrzu� wyj�tek*/
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
