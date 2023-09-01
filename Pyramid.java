package patterns;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=5;j++) {
				if(i+j==4 || i+j==6 && i>1 || i+j==8)
				{
					//System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
