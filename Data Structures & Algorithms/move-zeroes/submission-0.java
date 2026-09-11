class Solution {
    public static void moveZeroes(int[] ar) {

        int k = 0;

        for (int i = 0; i < ar.length; i++) {

            if (ar[i] != 0) {
                ar[k] = ar[i];
                k++;
            }
        }

        while (k < ar.length) {
            ar[k] = 0;
            k++;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int arLength = scan.nextInt();
        int[] ar = new int[arLength];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }

        moveZeroes(ar); 

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
        
