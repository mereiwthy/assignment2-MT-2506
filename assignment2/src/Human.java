public abstract class Human {
    protected int age;
    protected String name;
    protected boolean isWorking ;

    public Human(int age, String name, boolean isWorking) {
        this.age = age;
        this.name = name;
        this.isWorking = isWorking;
    }

    public String sayYourPosition() {
        return "I am a human";
    }

    public abstract String getSpecificInfo();
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public boolean getHaveWork() {return isWorking;}
    public void setHaveWork(boolean isWorking) {this.isWorking= isWorking;}
}

