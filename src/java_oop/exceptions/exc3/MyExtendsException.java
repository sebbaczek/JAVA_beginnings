package java_oop.exceptions.exc3;

import java_oop.exceptions.exc1.MyException;

public class MyExtendsException extends MyException {
//        private String mymessage;

        public MyExtendsException(String mymessage) {
                super(mymessage);

        }

//        public String getMymessage() {
//                return mymessage;
//        }
}
