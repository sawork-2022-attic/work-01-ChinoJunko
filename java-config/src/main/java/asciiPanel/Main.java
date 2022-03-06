package asciiPanel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import java.awt.*;

@Configuration
public class Main {

    @Bean
    public AsciiPanel asciiPanel() {
        return new AsciiPanel();
    }

    @Bean
    public AsciiFont asciiFont() {
        return new AsciiFont();
    }

    @Bean
    public String fontFilename() {
        return "cp437_16x16.png";
    }

    @Bean
    public int width() {
        return 16;
    }

    @Bean
    public int height() {
        return 16;
    }

    @Bean
    public Color defaultForegroundColor() {
        return AsciiPanel.green;
    }

    @Bean
    public Color defaultBackgroundColor() {
        return AsciiPanel.red;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        AsciiPanel asciiPanel = context.getBean(AsciiPanel.class);

        asciiPanel.write("Welcome to Software Architecture!");
        JFrame jFrame = new JFrame();
        jFrame.add(asciiPanel);
        jFrame.pack();
        jFrame.setVisible(true);

        context.close();

    }
}
