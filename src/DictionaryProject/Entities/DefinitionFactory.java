package DictionaryProject.Entities;

public interface DefinitionFactory {

    Definition createDefinition(String meaning, String sentence, String sentenceMeaning);
}
