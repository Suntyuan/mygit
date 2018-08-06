package y2ssh.zhangcuishan.aop;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;

public class LogAdvice implements AfterReturningAdvice{

	public void afterReturning(Object returnValue ,Method method,
		Object[] args,Object target) throws Throwable {
		System.out.println("[业务日志]\n    时间：" + new Date() + "\n  业务类：" 
				+ target.getClass().getName() + "\n业务方法："
				+ method.getName()+ "\n    参数："
				+ printArray(args) + "\n  返回值："
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
