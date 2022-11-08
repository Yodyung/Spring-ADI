package ex1_xml2_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//1. 스프링 설정 파일 연결
		ApplicationContext context = new ClassPathXmlApplicationContext("ex1_xml2_ref/applicationContext.xml");
		//2. DI - 스프링 컨테이너에서 빈을 가져오기
		MemberBean bean =context.getBean("member", MemberBean.class);
		bean.output();

		MemberBean bean2 =context.getBean("member2", MemberBean.class);
		bean2.output();
		
		MemberDao dao1= context.getBean("dao",MemberDao.class);
		dao1.insert();

		MemberDao dao2= context.getBean("dao2",MemberDao.class);
		dao2.insert();
		
		
	}

}
