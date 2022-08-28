package optional.exc5;



import java.util.Optional;

/**
 * Stw�rz klas� User, kt�ra b�dzie zawiera�a pola id, name, surname. Zdefiniuj metod�
 * findUserByName(String name), kt�ra zwr�ci Optional. Wywo�aj t� metod�. Nast�pnie, je�eli taki user
 * nie istnieje, zwr�� w optionalu defaultow� definicj� Usera (stw�rz jaki� konstruktor domy�lny).
 * Je�eli User istnieje, to wydrukuj to na ekranie
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
