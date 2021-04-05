
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list={1,2,3,4,45};
		int[] list2= {3,4,5,6,8,9};

		fark(list, list2);

	}
	
	static void fark(int[] list, int[] list2) {
		boolean a=false;
		for(int i=0;i<list.length;i++) {
			for(int j=0;j<list.length;j++) {
				if(list[i]==list2[j]) {
					a=false;
					break;
				}
				a=true;
			}
			if(a==true)
				System.out.println(list[i]);
		}
	}

}
