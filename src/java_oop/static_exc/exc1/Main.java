package java_oop.static_exc.exc1;

import java_oop.static_exc.global.Global;

/**
 * Zdefiniuj statyczn� sta�� globaln� w klasie Global w paczce global. Zwr�� uwag�, �e masz do niej
 * dost�p z ka�dej innej klasy i nie mo�esz zmieni� warto�ci zdefiniowanej sta�ej. Postaraj si�
 * zaimportowa� zdefiniowan� sta�� na dwa sposoby:
 * ? poprzez import zwyk�y - String globalConstant = Global.GLOBAL_CONSTANT;
 * ? poprzez import statyczny - String globalConstant = GLOBAL_CONSTANT;
 */

public class Main {
        //        String globalConstant = Global.GLOBAL_CONSTANT;
        String globalConstant = Global.GLOBAL_CONSTANT;
}
