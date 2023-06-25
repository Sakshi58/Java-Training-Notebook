public class butterflyPattern {
    public static void main(String[] args) {

        int n = 4;
        /// first outer loop
        ////upper half

        for (int i = 0; i < n; i++) {
            // loop for printing 1st part stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            /// loop for printing spaces

            int spaces= 2*(n-i);

            for (int j = 0; j <= spaces; j++) {
                System.out.print(" ");
            }
            /// loop for printing 2nd part stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //////lower half 
        for (int i = n; i>=0; i--) {
            // loop for printing 1st part stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            /// loop for printing spaces

            int spaces= 2*(n-i);

            for (int j = 0; j <= spaces; j++) {
                System.out.print(" ");
            }
            /// loop for printing 2nd part stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}




/*

*         *
**       **
***     ***
****   ****
***** *****
****   ****
***     ***
**       **
*         *           */
