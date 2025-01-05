package AdvancedDictionaryProject.Entities;

public class Definition {
    private String wordType, meaning, sentence, sentenceMeaning;

    public Definition() {

    }


    public Definition(String wordType, String meaning, String sentence, String sentenceMeaning) {
        this.meaning = meaning;
        this.wordType = wordType;
        this.sentence = sentence;
        this.sentenceMeaning = sentenceMeaning;
    }

    @Override
    public String toString() {
        return "Definition{" +
                "wordType='" + wordType + '\'' +
                ", meaning='" + meaning + '\'' +
                ", sentence='" + sentence + '\'' +
                ", sentenceMeaning='" + sentenceMeaning + '\'' +
                '}';
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

    public void setWordType(String wordType) {
        this.wordType = wordType;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public void setSentenceMeaning(String sentenceMeaning) {
        this.sentenceMeaning = sentenceMeaning;
    }
}
