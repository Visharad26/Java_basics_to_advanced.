class n_to_1 {
    public static void main(String[] args) {
        int n = 6;
        fun(n);
    }

    public static int fun(int n) {
        if (n == 0)
            return 0;
        else {
            System.out.print(n + " ");
            return fun(n - 1);
        }
    }
}
