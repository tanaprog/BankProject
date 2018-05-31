import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tanaprog.bank.repository.ClientRepository;

public class ApplicationRun {

	public static void main(String[] args) {
		System.out.println("Application start");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		ClientRepository clientRepository = context.getBean(ClientRepository.class);
		System.out.println(clientRepository.findAll());

		context.close();
		System.out.println("Application stop");
	}

}
