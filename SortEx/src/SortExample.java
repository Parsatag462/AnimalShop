public class SortExample {
    public static void main(String[] args) {
        int[] numbers = {40, 7, 59, 4, 1};
        displayValues(numbers);

//        selectionSort(numbers);
        bubbleSort(numbers);
        displayValues(numbers);
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
        System.out.println("\n");
    }
}
