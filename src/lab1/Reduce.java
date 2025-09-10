package lab1;

public class Reduce {
    static void main() {
        int num = 100;
        System.out.println(reduce(num));
    }

    public static int reduce(int n) {
        int steps = 0;
        while(n > 0){
            if (n % 2 == 0){
                n /= 2;
            } else {
                n -= 1;
            }
            steps++;
        }
        return steps;
    }
}
