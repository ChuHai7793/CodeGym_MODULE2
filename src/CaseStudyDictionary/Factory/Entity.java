package CaseStudyDictionary.Factory;

public class Entity {

    private String name,definition;

    public Entity(){

    }

    public Entity(String name,String definition) {
        this.name = name;
        this.definition = definition;
    }


    /*------------------------------------- GETTER -------------------------------------------------*/

    public String getName() {
        return name;
    }

    public String getDefinition() {
        return definition;
    }

}
