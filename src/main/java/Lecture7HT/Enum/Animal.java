package Lecture7HT.Enum;

public enum Animal {
    DOG("walk"), BIRD("fly"), HORSE("run");

    private String action;

    Animal (){  //дефолтный конструктор обязателен, если есть другие конструкторы
    }

    Animal(String action){
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
