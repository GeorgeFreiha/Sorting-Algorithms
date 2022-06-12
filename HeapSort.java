//1st step: Insert data to binary heap tree
//2nd step: Extract data from binary heap

public class HeapSort{
  int[] arr = null;
  public HeapSort(int[] arr){
    this.arr = arr;
  }
  public void sort(){
    BinaryHeap bh = new BinaryHeap(arr.length);
    for(int i = 0; i < arr.length; i++){
      bh.insertInHeap(arr[i]);
    }
    for(int i  = 0; i < arr.length; i++){
      arr[i] = bh.extractHeadOfHeap();
    }
  }


   	public  void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}
}