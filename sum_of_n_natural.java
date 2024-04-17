public class sum_of_n_natural {
    static int fun(int n) {
        if (n == 0)
            return 0;
        return n + fun(n - 1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fun(n));
    }
}
