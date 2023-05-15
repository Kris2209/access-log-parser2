public class Practice_Method {
    public static void main(String[] args) {

        System.out.println(isDivisor(5,0));
        System.out.println(isDivisor(0,5));
        System.out.println(isDivisor(100, 2));
        System.out.println(isDivisor(11, 30));

    }
    public static double fraction(double x){
        double res = x - (int)x;
        return res;
    }
    public static int sumLastNums(int x){
        int x1 = x%10;
        int x2 = x/10;
        int x3 = x2%10;
        int res = x1 + x3;
        return res;
    }
    public static int charToNum(char x){
        int y = x - 48;
        return y;
    }

    public static boolean isPositive(int x){
        return x > 0;
    }

    public static boolean is2Digits(int x){
        boolean res = (x>=10 && x<=99) || (x<=-10 && x>=-99);
        return res;
    }

    public static boolean isUpperCase(char x){
        return x>='A' && x<= 'Z';
    }

    public static boolean isInRange(int a, int b, int num){
        boolean res = (num >= a && num <= b) || (num <= a && num >= b);
        return res;
   }

    public static boolean isDivisor (int a, int b){
       boolean res =(a==0 || b==0) || (a%b==0 || b%a==0);
        return res;
    }

    public static boolean isEqual (int a, int b, int c){
        boolean res =(a==b) && (b==c);
        return res;
    }

    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }
}
