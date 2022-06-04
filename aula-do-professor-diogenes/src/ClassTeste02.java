
public class ClassTeste02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] arr = {{{1,2},{3,4}},{{5,6},{7,8}}};
		
		for(int i = 0; i < 2;i++) {
			for(int j = 0; j < 2;j++) {
				for(int k = 0; k < 2;k++) {
					System.out.printf("arr[%d][%d][%d] = %d\n",i,j,k,arr[i][j][k]);
					
				}
				System.out.println(" ");
			}
			System.out.println(" ");
			
		}

	}

}
