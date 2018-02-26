public class QuicksortTester {
    public static void main (String [] args) {
        QuickSort sort = new QuickSort();
        int array[] = new int[25];
        for (int n = 0; n <= 24; n++) {
            int num = (int)(Math.random() * 40) + 1;
            array[n] = num;
        }
        
        sort.QuickSort(array, 0, array.length-1);
        
        for (int n = 0; n <= 24; n++) {
            System.out.println(array[n]);
        }
    }
}