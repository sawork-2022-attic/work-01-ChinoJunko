package asciiPanel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config-annotation.xml");

        AsciiPanel asciiPanel = context.getBean(AsciiPanel.class);

        asciiPanel.write("Welcome to Software Architecture!");
        JFrame jFrame = new JFrame();
        jFrame.add(asciiPanel);
        jFrame.pack();
        jFrame.setVisible(true);

    }
}
