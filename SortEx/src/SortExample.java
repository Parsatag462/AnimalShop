public class SortExample {
    public static void main(String[] args) {
        int[] numbers = {40, 7, 59, 4, 1};
        displayValues(numbers);

//        sequentialSearch(numbers, 13);
//        sequentialSearch(numbers, 7);
        binarySearch(numbers, 7);

        selectionSort(numbers);
//        bubbleSort(numbers);
        displayValues(numbers);
        binarySearch(numbers, 7);
    }

    static public void binarySearch(int[] num, int val){
        int low = 0;
        int high = num.length-1;
        while (high>=low){
            int mid = (low+high)/2;
            if (num[mid]==val){
                System.out.println("The number "+val+" is at position "+mid+" in the list");
                return;
            }
            if (num[mid]<val)
                low = mid+1;
            if (num[mid]>val)
                high= mid-1;
        }
        System.out.println("The number "+val+" is not in the list");
    }

    static void sequentialSearch(int[] num, int val){
        for (int i=0; i< num.length; i++){
            System.out.println("The number "+val+" is at position "+i+" on the list");
            return;
        }
        System.out.println("The number "+val+" is not on the list");
    }

    static void bubbleSort(int[] num){
        for (int i=0; i< num.length; i++){
            for (int j=0; j< num.length-1; j++){
                if (num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] num){
        int indexMin = 0;
        for (int i=0; i< num.length; i++){
            indexMin=i;
            for (int j = i+1; j < num.length; j++){
                if (num[j] < num[indexMin]){
                    indexMin=j;
                }
            }
            int temp = num[i];
            num[i] = num[indexMin];
            num[indexMin] = temp;
        }
    }

    static void displayValues(int[] num){
        for (int i=0; i<num.length; i++)
            System.out.print(num[i] + " ");
        System.out.println();
    }
}
