import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
//		int vet[] = new int[100];
//		for (int i = 0; i < 100; i++) vet[i] = (int) (Math.random() * 100);
//		
//		System.out.println(Arrays.toString(vet));
//		ArraySort sort = new ArraySort(vet);
//		sort.mergeSort();
//		vet = sort.a;
//		System.out.println(Arrays.toString(vet));
		
		
		int vet[] = new int[100];
		for (int i = 0; i < 100; i++) vet[i] = (int) (Math.random() * 100);
		
		System.out.println(Arrays.toString(vet));
		ArraySort.sorting(vet, 0, vet.length - 1);
		System.out.println(Arrays.toString(vet));
		
	}

}
