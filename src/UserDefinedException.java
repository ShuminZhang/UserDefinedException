
/*
 * 1.������ͨ���û�����ֵ�仯�߶ȣ��û����룬�����в�����ȡ�� String->int int h = Integer.parseInt(args[0]);
 * 2.�ж��û���û�и����� exception
 * 3.���û������Ƿ����루�û�������A��B��C�ȣ���exception����catch��ӵĶ�������ͨ��������һ���������������������õ�exception
 *   NumberFormatException
 * 4.ʹ���Զ���exception:���û�û�и������в���ʱ���׳��Զ����쳣����catch���Զ���exception
 *   1)�Զ���һ��exception��
 *   2)ʹĳ��������ĳ������ʱ�׳�exception
 */
public class UserDefinedException extends Exception {

//	private int detail;
	public UserDefinedException(String detail){
		super(detail);
	}
	
}
