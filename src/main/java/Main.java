public class Main {

    public static int compute(int x, int y) {

        if (x < y) {
            int temp = 0;
            temp = x;
            x = y;
            y = temp;
        }

        boolean flag = true;

        while (flag) {
            if ( x % y == 0) {
                return y;
            }else if( x % y != 0){
                int tempX = x;
                x = y;
                y = tempX % y;
            }
        }
        return 0;
    }


}


