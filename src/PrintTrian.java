public class PrintTrian {
	static int getHight(String[] args) throws UserDefinedException {
		// TODO Auto-generated method stub
		int height;
		if(args.length==0) 
			 throw new UserDefinedException("δ����ߵͲ�����");
		height=Integer.parseInt(args[0]);
		return height;
	}

	public static void main(String[] args) throws UserDefinedException {
		// TODO Auto-generated method stub
		int h=0;
		try {
			h=getHight(args);
		}
		/*δ�������exception*/	
		catch(UserDefinedException e) {	
			System.out.println("�����쳣Ϊ��"+e);
		}
		/*����Ƿ�����exception*/
		catch(NumberFormatException e2) {
			System.out.println("����Ƿ��߶Ȳ�����");
			System.out.println("�����쳣Ϊ��"+e2);
		}
		
		System.out.println("�߶���ֵ:"+h);
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
