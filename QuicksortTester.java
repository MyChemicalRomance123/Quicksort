public class QuicksortTester {
    private static void main (String [] args) {
        int array[] = new int[25];
        for (int n = 0; n <= 24; n++) {
            int num = (int)(Math.random() * 40) + 1;
            array[n] = num;
        }
        
        
        for (int n = 0; n <= 24; n++) {
            System.out.println(array[n]);
        }
    }
}