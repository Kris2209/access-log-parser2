public class Practice_for_while {
    public static void main(String[] args) {
       boolean res = equalNum(1121);
        System.out.println(res);


    }

    public static String listNums(int x) {
        String res = "";
        for (int i = 0; i <= x; i++) {
            res += i + " ";
        }
        return res;
    }

    public static String reverseListNums(int x) {
        String res = "";
        for (; x >= 0; x--) {
            res += x + " ";
        }
        return res;
    }

    public static String chet(int x) {
        String res = "";
        for (int i = 0; i <= x; i += 2) {
            res += i + " ";
        }
        return res;
    }

    public static int pow(int x, int y) {
        int res = 1;
        for (int i = 1; i <= y; i++) {
            res *= x;
        }
        return res;
    }

    public static int numLen(long x) {
        int i = 0;
        while (x > 0) {
            x /= 10;
            i += 1;
        }
        return i;
    }

    public static boolean equalNum(int x) {
        boolean res = true;
        for (int i = x; i >= 10; i /= 10) {
            int i2 = x % 10;
            if (i2 != i % 10) res = false;
            break;
        }
        return res;
    }

    public static void square(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = x; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void guessGame() {
        int randomNum = 3;
        int x;
        int count = 0;
        do {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("What number am I thinking (0 to 9)? :");
            x = sc.nextInt();
            count +=1;
            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + randomNum);
                System.out.println("Количество попыток: " + count);
            }
        }
        while (randomNum != x);

        }
    }