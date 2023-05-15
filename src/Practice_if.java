public class Practice_if {
    public static void main(String[] args) {
        printDays("вторник");
        System.out.println();
        printDays("пятница");
        System.out.println();
        printDays("ку");
        System.out.println();
        printDays("понедельник");

    }
    public static int abs(int x){
        if(x<0) x=-x;
        return x;
    }
    public static int safeDiv(int x, int y){
        if  (y!=0) return x/y;
        return 0;
    }
    public static int max(int x, int y){
        if (x>y) return x;
        return y;
    }
    public static String makeDecision(int x, int y){
        if (x>y) return x + " > " + y;
        if (x<y) return x + " < " + y;
        return  x + " == " + y;
    }
    public static int max3(int x, int y, int z){
        if (x>=y && x>=z) return x;
        if (y>=x && y>=z) return y;
        return z;
    }
    public static boolean sum3(int x, int y, int z){
        return (x+y==z) || (x+z==y) || (y+z==x);
    }
    public static int sum2(int x, int y){
        int sum = x+y;
        if (sum>9 && sum<20) return 20;
        return sum;
    }
    public static boolean is35(int x){
        if (x%3==0 && x%5==0) return false;
        if (x%3==0 || x%5==0) return true;
        return false;
    }
    public static boolean magic6(int x, int y){
        return x==6 || y ==6 || x+y==6 || x-y==6;
    }
    public static String age(int x){
        if (x%10==1 && (int)x/10!=11) return x + " год";
        if ((x%10==2 || x%10==3 || x%10==4) && (x/10!=12 && x/10!=12 && x/10!=13 && x/10!=14)) return x + " года";
        return x + " лет";
    }
    public static String day(int x){
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        }
    }
    public static void printDays(String x){
        switch (x){
        case "понедельник": System.out.println("понедельник");
        case "вторник": System.out.println("вторник");
        case "среда": System.out.println("среда");
        case "четверг": System.out.println("четверг");
        case "пятница": System.out.println("пятница");
        case "суббота": System.out.println("суббота");
        case "воскресенье": System.out.println("воскресенье"); break;
        default: System.out.println("это не день недели");}
    }

}
