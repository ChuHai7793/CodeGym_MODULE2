package CaseStudyDictionary.Factory;

public interface EntityFactory {

//    public  abstract EntityInterface createEntity();
    public abstract Entity createEntity(String name, String info);
}
