import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice_arrays {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.toString(add(arr, arr2, 3)));
    }

    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int findFirst2(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (x == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int maxAbs(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(arr[max])) max = i;
        }
        return arr[max];
    }

    public static int countPositive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) count++;
        }
        return count;
    }

    public static boolean palindrom(int[] arr) {
        boolean x = true;
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            if (arr[i] != arr[len - i - 1]) {
                x = false;
                break;
            }
        }
        return x;
    }

    public static void reverse(int[] arr) {
        int x = 0;
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for (int i = arr2.length - 1; i >= 0; i--) {
            arr[x] = arr2[i];
            x++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] reverseBack(int[] arr) {
        int[] arr2 = new int[arr.length];
        int x = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[x] = arr[i];
            x++;
        }
        return arr2;
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int j = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            arr3[j++] = arr2[i];
        }
        return arr3;
    }

    public static int[] findAll(int[] arr, int x) {
        int[] arr2 = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                arr2[j++] = i;
            }
        }
        int[] res = new int[j];
        for (int g = 0; g < j; g++) {
            res[g] = arr2[g];
        }
        return res;
    }

    public static int[] deleteNegative(int[] arr) {
        int[] arr2 = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr2[j++] = arr[i];
            }
        }
        int[] res = new int[j];
        for (int g = 0; g < j; g++) {
            res[g] = arr2[g];
        }
        return res;
    }

    public static int[] add(int[] arr, int x, int pos) {
        int[] arr2 = new int[arr.length + 1];
        int index = 0;
        for (int i = 0; i < pos; i++) {
            arr2[i] = arr[i];
            index++;
        }
        arr2[index++] = x;
        System.out.println(index);
        for (int i = index; i < arr2.length; i++)
            arr2[i] = arr[i - 1];
        System.out.println(Arrays.toString(arr2));
        return arr2;
    }

    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] res = new int[arr.length + ins.length];
        int index = 0;
        int indInt = 0;
        for (int i = 0; i < pos; i++) {
            res[i] = arr[i];
            index++;
        }
        for (int i = index; i < ins.length + index; i++) {
            res[i] = ins[indInt++];
        }
        for (int i = index + ins.length; i < res.length; i++) {
            res[i] = arr[index++];
        }
        return res;
    }
}

