package Lecture7HT.toStringEqualsHashCodeStatic;

import java.util.Objects;

public class AnimalEqualsHashCode {
    private int id;

    public AnimalEqualsHashCode(int id){
        this.id = id;
    }
    public boolean equals (Object obj){
        AnimalEqualsHashCode otherAnimal = (AnimalEqualsHashCode) obj;
        return this.id == otherAnimal.id;
    }
    public int hashCode(){
        return Objects.hash(id);
    }

}

