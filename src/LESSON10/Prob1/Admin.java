package LESSON10.Prob1;

import java.util.*;
public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> map = new HashMap<>();
        for (Student s : students) {
            Key k = new Key(s.getFirstName(), s.getLastName());
            map.put(k, s);
        }
        return map;
    }
}
