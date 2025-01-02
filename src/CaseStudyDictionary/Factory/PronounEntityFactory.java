package CaseStudyDictionary.Factory;

public class PronounEntityFactory implements EntityFactory {
    @Override
    public Entity createEntity(String name, String pronunciation){
        return new Entity(name,pronunciation);
    }
}
