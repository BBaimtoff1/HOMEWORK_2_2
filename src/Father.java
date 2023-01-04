public class Father extends GrandFather {
private int age;

private Family family;

    public Family getFamily() {
        return family;
    }

    public Father(House house, String name, int age, Family family) {
        super(house, name);
        this.age = age;
        this.family = family;
    }

    public int getAge() {
        return age;

    }
    public void makeWork(){
        System.out.println("Читает книгу");
    }
    final public void makeWork(String work){
        System.out.println(work);
    }

    public String getInfo(){
        return "name " + getName() +
                "\nHouse" + getHouse() +
                "\nAge" + age +
                "\nFamily" + family.getName() + family.getAge();
    }
}


