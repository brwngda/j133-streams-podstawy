package pl.sda.j133.streams.podstawy.zadanie2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.j133.streams.podstawy.Person;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Programmer {
    private Person person;
    private List<String> languages;
}
