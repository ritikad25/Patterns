package patterns;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=5;j++) {
				if(i+j==4 || i+j==6 && i>1 || i+j==8)
				{
					//System.out.print("*");
					System.out.print(i+ " ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
/*
  1 2   3 	4 	5  ====j
1		*		(1,5)
2	*		*(2,4)
3*		*		*
	*		*
		*
*/









