package AdvancedDictionaryProject.Entities;

import DictionaryProject.Entities.Definition;

public interface DefinitionFactory {

    Definition createDefinition(String meaning, String sentence, String sentenceMeaning);
}
