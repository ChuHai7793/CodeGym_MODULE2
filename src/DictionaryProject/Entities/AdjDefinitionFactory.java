package DictionaryProject.Entities;

public class AdjDefinitionFactory implements DefinitionFactory{

    @Override
    public Definition createDefinition(String meaning, String sentence, String sentenceMeaning) {
        return new Definition("adjective",meaning,sentence,sentenceMeaning);
    }

}
