package portfolio.javamasterclass;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            System.out.println(languages.put("Java", "Java Course"));
        }
        System.out.println(languages.get("Java"));

        System.out.println("====================================");
//        languages.remove("Lisp");
        if (languages.remove("Algol", "a family of algorithmic languages")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }
        if (languages.replace("Lisp", "This will not work", "a functional programming language with imperative features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp not replaced");
        }
//        System.out.println(languages.replace("Scala", "this will not be added"));
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
