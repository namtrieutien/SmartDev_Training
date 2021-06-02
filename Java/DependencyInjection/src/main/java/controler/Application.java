package controler;

import model.Teacher;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        AbstractApplicationContext context;
        context = new ClassPathXmlApplicationContext("teacher_beans.xml");
        Teacher teacher = (Teacher) context.getBean("teacher");
        System.out.println(teacher);
    }
}
