public class ppzz{
	public static void main(String[] args) {
		//0.0 <= X <1.0
		double ra = Math.random() *6; // 0.0 ~ 5.99999999999999
		ra = ra+1;
		int num = (int) ra;
		System.out.println(num);
		int num2 = (int) (Math.random() * 6 + 1);
		System.out.println(num2);
		// Unix Time
		long ut = System.currentTimeMillis();
		System.out.println(ut); // 씨드값으로 활용하기좋다
	}
}
