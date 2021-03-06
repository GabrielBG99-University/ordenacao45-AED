
public class ArraySort {
	public int a[];
	
	public ArraySort(int[] a) {
		this.a = a;
	}
	
	public void mergeSort() {
		int tempArray[] = new int[a.length];
		mergeSort(tempArray,0,a.length-1); 
    }
    
	private void mergeSort(int []tempArray,int lowerIndex,int upperIndex){
        if(lowerIndex == upperIndex){
            return;
        }else{
            int mid = (lowerIndex+upperIndex)/2;
            mergeSort(tempArray, lowerIndex, mid);
            mergeSort(tempArray, mid+1, upperIndex);
            merge(tempArray,lowerIndex,mid+1,upperIndex);
        }
    }
 
    private void merge(int []tempArray,int lowerIndexCursor,int higerIndex,int upperIndex){
        int tempIndex=0;
        int lowerIndex = lowerIndexCursor;
        int midIndex = higerIndex-1;
        int totalItems = upperIndex-lowerIndex+1;
        while(lowerIndex <= midIndex && higerIndex <= upperIndex){
            if(a[lowerIndex] > a[higerIndex]){
                tempArray[tempIndex++] = a[lowerIndex++];
            }else{
                tempArray[tempIndex++] = a[higerIndex++];
            }
        }
 
        while(lowerIndex <= midIndex){
            tempArray[tempIndex++] = a[lowerIndex++];
        }
 
        while(higerIndex <= upperIndex){
            tempArray[tempIndex++] = a[higerIndex++];
        }
 
        for(int i=0;i<totalItems;i++){
            a[lowerIndexCursor+i] = tempArray[i];
        }
    }

    public static int partition(int arr[], int left, int right){
        int pivot = arr[left];
        int i = left;
        for(int j = left + 1; j <= right; j++){
            if (arr[j] > pivot){
                i = i + 1;
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }

        int temp = arr[i];
        arr[i] = arr[left];
        arr[left] = temp;

        return i;

    }

    public static void sorting(int arr[], int left, int right){
        if(left < right)
        {
            int q = partition(arr, left, right);
            sorting(arr, left, q);
            sorting(arr, q + 1, right);
        }
    }

}
