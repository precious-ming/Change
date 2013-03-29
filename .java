public class Change{

  public static void main(String[] args){
	
	
		java.util.Scanner input = new java.util.Scanner(System.in);
				
		System.out.println("本程序交换数字x和y的值!\n");
		System.out.println("请您分别输入数字x和y的值，并以回车结束回车 ");
			
		int x = input.nextInt();
		int y = input.nextInt();
		
		System.out.println("您输入的数字是: \n"+"x = "+x+"\ny = "+y);
		
		int c;
		c = x;
		x = y;
		y = c;
		
		System.out.println("恭喜您！成功交换x和y的值："+"\nx = "+x+"\ny = "+y);
		
	
	}

}
