package week1.day1;
public class Collge extends University{
	@Override
	public void pg() {
		System.out.println("MSC IT");// TODO Auto-generated method stub
		
	}

	@Override
	public void ug() {
		// TODO Auto-generated method stub
		System.out.println("B.TECH IT");
	}
	public static void main(String[] args) {
University name=new Collge();
name.pg();
name.ug();
}
}
