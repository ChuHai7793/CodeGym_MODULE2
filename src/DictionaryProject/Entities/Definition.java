package DictionaryProject.Entities;

public class Definition {
    private String wordType,meaning, sentence, sentenceMeaning;

    public  Definition(){};


    public Definition(String wordType,String meaning, String sentence, String sentenceMeaning){
        this.meaning = meaning;
        this.wordType = wordType;
        this.sentence = sentence;
        this.sentenceMeaning = sentenceMeaning;
    }


    public String getMeaning() {
        return meaning;
    }

    public String getWordType() {
        return wordType;
    }

    public String getSentence() {
        return sentence;
    }

    public String getSentenceMeaning() {
        return sentenceMeaning;
    }
}
