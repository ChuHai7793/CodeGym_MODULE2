package ss11.BaiTap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWordFreq {

    public static void main(String[] args) {

        String paragraph = "This is really a super cool but sad paragraph. Im sad, very sad, super sad.";

        ArrayList<String> paraArrList = getWordsFromParagraph(paragraph);

        TreeMap<String, Integer> treeMap = createWordFreqencyTreeMap(paraArrList);

        System.out.print(treeMap);
    }

    private static TreeMap<String, Integer> createWordFreqencyTreeMap(ArrayList<String> paraArrList) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        String upperCaseWord;
        for (String word : paraArrList) {
            upperCaseWord = word.toUpperCase();
            if (treeMap.containsKey(word)) {
                treeMap.put(upperCaseWord, treeMap.get(word) + 1);
            } else {
                treeMap.put(upperCaseWord, 1);
            }
        }
        return treeMap;
    }

    private static ArrayList<String> getWordsFromParagraph(String paragraph) {
        ArrayList<String> paraArrList = new ArrayList<>();
        // Regex for English alphabet
        String regex = "[a-zA-Z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(paragraph);
        System.out.println("Matching words:");
        while (matcher.find()) {
            paraArrList.add(matcher.group());
        }
        return paraArrList;
    }
}
