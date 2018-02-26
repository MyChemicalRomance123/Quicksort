public class QuickSort {
    public QuickSort(){
        
    }
    public static void QuickSort (int[] a, int left, int right){
        if (left >= right) return;
        int i = left;
        int j = right;
        int pivotValue = a[(left + right)/2];  // Pivot is at midpoint
        while (i < j){
            while (a[i] < pivotValue) i++;
            while (pivotValue < a[j]) j--;
            if (i <= j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        QuickSort (a, left, j);
        QuickSort (a, i, right);
    } 
}
