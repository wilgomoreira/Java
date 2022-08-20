package site.wilgo.maratonajava.javacore.Rdates;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTeste01 {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        // Instant and LocalDateTime are very similar
        System.out.println(instant);
        System.out.println(LocalDateTime.now());


    }
}
