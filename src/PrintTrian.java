public class PrintTrian {
	static int getHight(String[] args) throws UserDefinedException {
		// TODO Auto-generated method stub
		int height;
		if(args.length==0) 
			 throw new UserDefinedException("未输入高低参数！");
		height=Integer.parseInt(args[0]);
		return height;
	}

	public static void main(String[] args) throws UserDefinedException {
		// TODO Auto-generated method stub
		int h=0;
		try {
			h=getHight(args);
		}
		/*未输入参数exception*/	
		catch(UserDefinedException e) {	
			System.out.println("触发异常为："+e);
		}
		/*输入非法参数exception*/
		catch(NumberFormatException e2) {
			System.out.println("输入非法高度参数！");
			System.out.println("触发异常为："+e2);
		}
		
		System.out.println("高度数值:"+h);
		for(int i = 0;i<h;i++) {
			for(int j = 0;j < h-i;j++) {
				System.out.print(" ");
			}
			for(int k = 0;k <= 2*i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
