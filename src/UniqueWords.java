import java.util.*;

public class UniqueWords {
    private static String engTextStr = "What is love Baby don't hurt me Don't hurt me no more Baby don't hurt me " +
            "Don't hurt me no more what is love Yeah yeah";
    private static List<String> listOfWords = Arrays.asList(engTextStr.split(" "));

    public static List<String> checkRegister(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equalsIgnoreCase(list.get(i))) {
                    list.set(j, list.get(j).toLowerCase());
                }
            }
        }
        return list;
    }
    public static void printUniqueWords(){

        HashSet<String> setOfWords = new HashSet<>(checkRegister(listOfWords));
        System.out.println(setOfWords);
    }
}
