package academy.devdojo.springboot.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Anime {
    private Long id;
    private String name;

}