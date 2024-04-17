class Geeks {

    static void follPatt(String s) {
        int x = 0;
        int y = 0;
        boolean flag = true;

        int n = s.length();
        int i = 0;

        while (i < n) {
            while (i < n && s.charAt(i) == 'x') {
                x++;

                i++;
            }
            while (i < n && s.charAt(i) == 'y') {
                y++;

                i++;
            }

            if (x != y) {
                flag = false;
                break;
            }
        }
        if (flag == false) {
            System.out.println(0);
        } else {
            if (x == y)
                System.out.println(1);

            else
                System.out.println(0);
        }
    }
}