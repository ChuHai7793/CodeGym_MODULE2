package CaseStudyDictionary;


import CaseStudyDictionary.Factory.AdjectiveEntityFactory;
import CaseStudyDictionary.Factory.Entity;
import CaseStudyDictionary.Factory.EntityFactory;
import CaseStudyDictionary.Factory.PronounEntityFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

public class Service {


    public Service(){

    }

    public boolean isExist(String keyword, String defType,HashMap<String,HashMap<String, Entity>> dataset){
        return dataset.get(defType).containsKey(keyword);
    }

    public ArrayList<String> lookup(String keyword, HashMap<String,HashMap<String, Entity>> dataset){
        ArrayList<String> lookupResult = new ArrayList<>();
        for (String defType: dataset.keySet()){
            if (isExist(keyword,defType,dataset)){
                if (lookupResult.isEmpty()){
                    lookupResult.add('@'+keyword);
                }
                lookupResult.add(defType);
                lookupResult.add(dataset.get(defType).get(keyword).getDefinition());
            };
        }
        return lookupResult;

    }


    public void addDefinition(String keyword, String definition, String prefixDefType, HashMap<String,HashMap<String, Entity>> dataset){

        EntityFactory concreteFactory = switch (prefixDefType) {
            case "Adjective" -> new AdjectiveEntityFactory();
            case "Pronoun" -> new PronounEntityFactory();
            default -> null;
        };

        if (concreteFactory!=null){
            Entity concreteEntity = concreteFactory.createEntity(keyword,definition);
            dataset.get(prefixDefType).put(keyword,concreteEntity);
        }
    }


    public void drop(){

    }

}
