package Backend16_PrototypeDesignPattern;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, Student> map = new HashMap<>();
    public Student get(String Key) {
        String key;
        return map.get(key);
    }
    
    public void put(String key, Student student) {
        map.put(key, student);
    }
}
