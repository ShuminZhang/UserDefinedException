
/*
 * 1.三角形通过用户给定值变化高度（用户输入，命令行参数获取） String->int int h = Integer.parseInt(args[0]);
 * 2.判断用户若没有给参数 exception
 * 3.若用户给定非法输入（用户输入了A、B、C等）做exception处理，catch后接的东西可以通过发生过一次这个意外在命令解释器得到exception
 *   NumberFormatException
 * 4.使用自定义exception:当用户没有给命令行参数时，抛出自定义异常，再catch到自定义exception
 *   1)自定义一个exception类
 *   2)使某方法满足某种条件时抛出exception
 */
public class UserDefinedException extends Exception {

//	private int detail;
	public UserDefinedException(String detail){
		super(detail);
	}
	
}
