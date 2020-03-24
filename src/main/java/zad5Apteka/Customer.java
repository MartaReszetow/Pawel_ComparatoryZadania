package zad5Apteka;
import lombok.*;

import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor


public class Customer {

    private String name;
    private int age;
    private boolean pregnant;
    private LocalTime joiningQueue;



    public Customer(String name, int age, boolean pregnant) {
        this.name = name;
        this.age = age;
        this.pregnant = pregnant;
        this.joiningQueue = LocalTime.now();
    }

    @Override
    public String toString() {
        return "{" +
                 name  +
                ", age:" + age +
                ", pregnant:" + pregnant +
                '}';
    }



}
