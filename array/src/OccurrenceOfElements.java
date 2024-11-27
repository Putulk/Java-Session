public class OccurrenceOfElements{
    public static void main(String[] args){
        int[] arr = new int[]{1, 1, 2, 2, 2, 2, 3};
        OccurrenceOfElements occurrenceOfElements = new OccurrenceOfElements();
        System.out.println("Occurrence of 1: "+occurrenceOfElements.occurrence(arr, 1));
        System.out.println("Occurrence of 2: "+occurrenceOfElements.occurrence(arr, 2));
    }

    public int occurrence(int[] a, int element){
        int n= a.length;
        int count = 0;

        for(int i=0; i<n-1; i++){
            if(a[i] == element){
                count++;
            }
        }
        return count;
    }
}
