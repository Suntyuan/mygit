package y2ssh.zhangcuishan.aop;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;

public class LogAdvice implements AfterReturningAdvice{

	public void afterReturning(Object returnValue ,Method method,
		Object[] args,Object target) throws Throwable {
		System.out.println("[ҵ����־]\n    ʱ�䣺" + new Date() + "\n  ҵ���ࣺ" 
				+ target.getClass().getName() + "\nҵ�񷽷���"
				+ method.getName()+ "\n    ������"
				+ printArray(args) + "\n  ����ֵ��"
				+ returnValue);
	}
	private String printArray(Object[] args){
		String s = "";
		for(Object o : args){
			s += o.toString();
		}
		return s;
	}
}
