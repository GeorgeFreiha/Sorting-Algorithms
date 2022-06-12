class Main {
  public static void main(String[] args) {
   int array [] = {10 ,3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8, 11};
  // MergeSort mergeSort = new MergeSort();
    // mergeSort.mergeSort(array, 0, array.length-1);
    // QuickSort QuickSort = new QuickSort();
    // QuickSort.quickSort(array, 0, array.length - 1);
    
    
    // QuickSort.printArray(array);
    HeapSort heapSort = new HeapSort(array);
    heapSort.sort();
    heapSort.printArray(array);
  }
}

