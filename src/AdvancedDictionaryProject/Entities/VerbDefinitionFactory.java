package AdvancedDictionaryProject.Entities;

import DictionaryProject.Entities.Definition;
import DictionaryProject.Entities.DefinitionFactory;

public class VerbDefinitionFactory implements DefinitionFactory {

    @Override
    public DictionaryProject.Entities.Definition createDefinition(String meaning, String sentence, String sentenceMeaning) {
        return new Definition("verb",meaning,sentence,sentenceMeaning);
    }
}
