public class Methods {
	public static void main(String[] args) {

		numbers(93,86);
exponets (6,3)
	}

	static void nuexponetsmbers(int start, int end) {

		if (start < end) {
			for (int i = start; i <= end; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = start; i >= end; i--) {
				System.out.println(i);
			}
		}
	}
	
	static int exponents(int base, int exp)
	{
		int ans=1;
		
		for(int i=1; i<=exp;i++)
		{
			ans*= base;
		}
return ans;



	}




}
