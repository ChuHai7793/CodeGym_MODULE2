package DictionaryProject.Entities;

public class NounDefinitionFactory implements DefinitionFactory{

    @Override
    public Definition createDefinition(String meaning,String sentence, String sentenceMeaning) {
        return new Definition("noun",meaning,sentence,sentenceMeaning);
    }
    
}
