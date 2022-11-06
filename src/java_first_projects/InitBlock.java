package java_first_projects;

public class InitBlock {
        static String value = "a";
        {
                value +="b";
        }
        static {
                value +="c";
        }
        {
                value +="d";
        }


        public static void main(String[] args) {
                System.out.println(InitBlock.value);
                System.out.println(InitBlock.value);
                System.out.println(InitBlock.value);
                System.out.println(InitBlock.value);
                new InitBlock();
                new InitBlock();
                new InitBlock();
                System.out.println(InitBlock.value);

        }
}
