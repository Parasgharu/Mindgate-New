import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sky.aop.ApplicationService;
import com.sky.aop.ApplicationServiceImp1;

public class TestAOPMain {

	public static void main(String[] args) {
		ApplicationContext beanFactory= new ClassPathXmlApplicationContext("spring.xml");
		
		ApplicationService annoservice= beanFactory.getBean(ApplicationService.class);
 		System.out.println(annoservice);
		annoservice.processApplication();
		
		annoservice.processApplicationWithAudit();
	}

}
