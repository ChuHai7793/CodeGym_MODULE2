package ss17.model;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String code;
    private String name;

    public Student(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}