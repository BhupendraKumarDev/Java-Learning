public class bubbleSort {

    public static void bubbleSort(int arr[]){
        for(int turns = 0; turns<arr.length-1; turns++){
            for(int j=0; j<arr.length-1-turns; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int  arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        /* 
            buuble sort
            {5, 4, 1, 3, 2} : unsorted array
            {1, 2, 3, 4, 5} : increasing order
            {5, 4, 3, 2, 1} : decreasing order
        */

        int arr[] = {5, 4, 1, 3, 2};

        bubbleSort(arr);
        printArr(arr);
    }
}
