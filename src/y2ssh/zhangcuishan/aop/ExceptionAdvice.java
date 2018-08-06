package y2ssh.zhangcuishan.aop;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdvice implements  ThrowsAdvice{
	public void afterThrowing(Method method,Object[] args, Object target,Throwable subclass){
			System.err.println("[�쳣��־]\n    ʱ�䣺" + new Date() + "\n  ҵ���ࣺ" 
					+ target.getClass().getName() + "\nҵ�񷽷���"
					+ method.getName()+ "\n    ������"
					+ printArray(args) + "\n�쳣��Ϣ��" 
					+ subclass.getMessage() + "\n��ջ��Ϣ��" 
					+ subclass.getStackTrace());
	}
	private String printArray(Object[] args){
		String s = "";
		for(Object o : args){
			s += o.toString();
		}
		return s;
	}
}
