import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRun {

	public static void main(String[] args) {
		System.out.println("Application start");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		context.close();
		System.out.println("Application stop");
	}

}
