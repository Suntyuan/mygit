package y2ssh.zhangcuishan.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import y2ssh.zhangcuishan.biz.GoodsBiz;

public class AopTest {
	public static void main(String[] args) {
		      ApplicationContext ctx = 
		          new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
		      
		      GoodsBiz goodsBiz = (GoodsBiz)ctx.getBean("goodsBiz");
		      goodsBiz.getMyGoodsList(15L);
		 }

}
