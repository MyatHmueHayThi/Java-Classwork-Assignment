package chapter10Exe;

 public class C10Exe1 {
	int countChar(char charArr[][],char ch) {
		int count=0;
		for(int i=0;i<charArr.length;i++) {
			for(int j=0;j<charArr[i].length;j++) {
				if (ch==charArr[i][j]) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		char charArr[][]= { {'a','b'}, {'a','e'},{'e','d'}};
		C10Exe1 obj = new C10Exe1();
		char ch='e';
		int count = obj.countChar(charArr, ch);
		System.out.print("Count:"+count);
		
		

	}

}
