package chapter10Exe;

public class C10Exe6 {

	public static void main(String[] args) {
		int num[] = new int[] {20,30,25,35,-16,60,-100};
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		double avg=sum/num.length;
		System.out.print("Average Value:"+avg);
	}

}
