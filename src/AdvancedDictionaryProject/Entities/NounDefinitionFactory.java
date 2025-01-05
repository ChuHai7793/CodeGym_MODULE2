package AdvancedDictionaryProject.Entities;

import DictionaryProject.Entities.Definition;
import DictionaryProject.Entities.DefinitionFactory;

public class NounDefinitionFactory implements DefinitionFactory {

    @Override
    public DictionaryProject.Entities.Definition createDefinition(String meaning, String sentence, String sentenceMeaning) {
        return new Definition("noun",meaning,sentence,sentenceMeaning);
    }
}
