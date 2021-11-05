public class CharacterInJava {

    String name;
    int age;

    public CharacterInJava(String nameInput, int ageInput) {
        this.name = nameInput;
        this.age = ageInput;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
