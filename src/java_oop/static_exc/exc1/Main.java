package java_oop.static_exc.exc1;

import java_oop.static_exc.global.Global;

/**
 * Zdefiniuj statyczn¹ sta³¹ globaln¹ w klasie Global w paczce global. Zwróæ uwagê, ¿e masz do niej
 * dostêp z ka¿dej innej klasy i nie mo¿esz zmieniæ wartoœci zdefiniowanej sta³ej. Postaraj siê
 * zaimportowaæ zdefiniowan¹ sta³¹ na dwa sposoby:
 * ? poprzez import zwyk³y - String globalConstant = Global.GLOBAL_CONSTANT;
 * ? poprzez import statyczny - String globalConstant = GLOBAL_CONSTANT;
 */

public class Main {
        //        String globalConstant = Global.GLOBAL_CONSTANT;
        String globalConstant = Global.GLOBAL_CONSTANT;
}
