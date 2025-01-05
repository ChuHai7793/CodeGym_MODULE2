package DictionaryProject.Entities;

public class VerbDefinitionFactory implements DefinitionFactory{

    @Override
    public Definition createDefinition(String meaning,String sentence, String sentenceMeaning) {
        return new Definition("verb",meaning,sentence,sentenceMeaning);
    }
}
