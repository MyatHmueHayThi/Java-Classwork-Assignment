package chapter10Exe;

public class C10Exe4 {
	int countMultiple(int arr[],int x) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % x == 0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[]= {4,5,10,20,3};
		C10Exe4 obj = new C10Exe4();
		int x=5;
		int countNum = obj.countMultiple(arr, 5);
		System.out.print("Count Multiple: "+countNum);
			
		}

	

}
