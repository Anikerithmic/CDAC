class Pattern3 {
    public static void main(String[] args) {
        char ch = 'A'; 
        int row = 5; 
        
            for (int i = 1; i <= row; i++) {
            int sp = row - i;

            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i-1); k++) {
                System.out.print(ch);
                ch++;
                if (ch > 'Z') {
                    ch = 'A';
                }
            }
            System.out.println();
    }
    }
}
// o/p: 
//     A
//    BCD
//   EFGHI
//  JKLMNOP
// QRSTUVWXY
