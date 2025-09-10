package lab1;

public class Multiples {
    static void main(String[] args) {
        int ans = multiples(1000, 3, 5);
        System.out.println(ans);
    }

    public static int multiples(int n, int a, int b) {
        int ans = 0;
        for (int i = 1; i < n; i++){
            if (i % a == 0 || i % b == 0){
                ans++;
            }
        }
        return ans;
    }
    public static int multiples(){
        return multiples(1000, 3, 5);
    }
}
