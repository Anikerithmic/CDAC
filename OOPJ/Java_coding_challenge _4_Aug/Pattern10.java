
class Pattern10 {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
        int n = 4;
        for (int i = 5; i <= 7; i++) {
            n--;
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
// o/p:
// 1 
// 2 4 
// 3 6 9 
// 4 8 12 16 
// 5 10 15 
// 6 12 
// 7 
