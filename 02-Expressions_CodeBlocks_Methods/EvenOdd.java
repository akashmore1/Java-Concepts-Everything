
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println(findIfEvenOrOdd(44));
    }

    public static boolean findIfEvenOrOdd(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
