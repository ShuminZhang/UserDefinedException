public class PrintTrian {
	static int getHight(String[] args) throws UserDefinedException {
		// TODO Auto-generated method stub
		int length=args.length;
		if(length==0) 
			 throw new UserDefinedException();
		return length;
	}

	public static void main(String[] args) throws UserDefinedException {
		// TODO Auto-generated method stub
		try {
			int len=getHight(args);
			int h=Integer.parseInt(args[0]);
			System.out.print("高度数值:"+h);
			System.out.println();
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
		catch(UserDefinedException e) {
			System.out.println("未输入高度参数！");		
			System.out.println("触发异常为："+e);
		}
	}


}
