package chapter10Exe;

public class C10Exe5 {
	int getHighest(int arr[]) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[]= {4,5,10,20,3};
		C10Exe5 obj = new C10Exe5();
		int high = obj.getHighest(arr);
		System.out.print("Highest Value:"+high);
		

	}

}
