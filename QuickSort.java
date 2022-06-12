public class QuickSort{
  
  static int partition(int[] array, int start, int end){
    int pivot = end;  //O(1)
    int i = start - 1;  //O(1)
    for(int j = start; j<=end; j++){  //O(N)
      if(array[j] <= array[pivot]){  //O(1)
        i++;                                   /////-->  //O(N)
        int temp = array [i];
        array[i] = array [j];    //}O(1)
        array[j] = temp;
      }
    }
    return i;  //O(1)
    
  }
  public static void quickSort(int[] array, int start, int end){//T(N)
    if(start < end){                                          /////-->  //O(NLogN)
      int pivot = partition(array, start, end); //O(N)
      quickSort(array, start, pivot - 1); //T(N/2)
      quickSort(array, pivot + 1, end); //T(N/2)
    }
  }

//space will take O(N) because we're calling a recursive method that takes N space in the stack memory




    public static void printArray(int []array){
    for(int i = 0; i < array.length; i++){
      System.out.print(array[i]+ " ");
    }
  }
  
  
}

















//Extra space is not required unlike merge sort but when writing with recursive calls
// we avoid quick sort
//Average expected time is O(NLog(N))