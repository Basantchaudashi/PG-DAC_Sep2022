 class H {
    public static void main(String[] args) {


        int i, j, row = 5;

        for (i = 0; i <= row; i++) {

            for (j =(row - i)-1; j >= 0; j--) {

                System.out.print(" ");
            }

            for (int k =i-1; k >=0; k--) {

                System.out.print((row-k)+" ");
            }

            System.out.println();
        }
    }
}