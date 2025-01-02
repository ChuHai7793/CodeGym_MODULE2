package CaseStudyDictionary.Factory;

public class AdjectiveEntityFactory implements EntityFactory {

    @Override
    public Entity createEntity(String name, String adjDef){
        return new Entity(name,adjDef);
    }
}
