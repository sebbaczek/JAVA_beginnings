public class Month2 {
    public static void main(String[] args) {
        int monthnumber = 12;

        switch (monthnumber) {
            case 1:

            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(daysnaumber1(monthnumber));
                    break;
            case 2:
                System.out.println(daysnaumber2(monthnumber));
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(daysnaumber3(monthnumber));
                break;
            default:
                System.out.println("Nie ma takiego miesi¹ca");

        }

    }

    private static int daysnaumber1(int x) {
        if (x==1){
            return (31);
        } else if (x==3) {
            return (2*31+28);
        }else if (x==5) {
            return (3*31+28+30);
        }else if (x==7) {
            return (4*31+28+30+30);
        }else if (x==8) {
            return (5*31+28+30+30);
        }else if (x==10) {
            return (6*31+28+30+30+30);
        }else {
            return (7*31+28+30+30+30+30);
        }

    }
    private static int daysnaumber2(int x) {
        return 28;
    }
    private static int daysnaumber3(int x) {
        if (x==4){
            return (31*2+28+30);
        } else if (x==6) {
            return (31*3+28+30+30);
        }else if (x==9) {
            return (31*5+28+30+30+30);
        } else  {
            return (31*6+28+30+30+30+30);
        }
    }
}
