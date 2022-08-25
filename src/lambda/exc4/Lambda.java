package lambda.exc4;

public class Lambda implements Lambdable4{
        public String count(int counter, int counter2, String somestring) {
                int sum = counter+counter2;
                return sum+somestring;
        }
}
