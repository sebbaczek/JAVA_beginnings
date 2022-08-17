package java_oop.exceptions.exc1;

public class MyException extends Exception{
        private String mymessage;

        public MyException(String mymessage) {
//                super(message);
                this.mymessage = mymessage;
        }

        public String getMymessage() {
                return mymessage;
        }
}
