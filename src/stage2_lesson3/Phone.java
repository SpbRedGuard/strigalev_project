package stage2_lesson3;
import  java.util.*;

public class Phone {
    private HashMap<String, Set<String>> phoneBook = new HashMap<>(); 

    public void add (String name, String phone){
        Set<String> tel = phoneBook.getOrDefault(name, new HashSet<>()); // Set ипользуем для возможности записи нескольких phone к одному name
        tel.add(phone);
        phoneBook.put(name,tel);
    }
    public void add (String name, String ... phones){
        Set<String> tel = phoneBook.getOrDefault(name, new HashSet<>());
        tel.addAll(Arrays.asList(phones));
        phoneBook.put(name,tel);
    }

    public Set<String> getPhoneNumber (String name) {
        return phoneBook.get(name);
    }
}
