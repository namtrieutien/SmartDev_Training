import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Application {
    public static void main(String[] args) {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        HelloWorld helloWorld = (HelloWorld)xmlBeanFactory.getBean("helloWorldBean");
        System.out.println(helloWorld.getMessage());
    }
}
