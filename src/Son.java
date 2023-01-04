public final class Son extends Father{

private String school;

private String typeOfComputer;

    public String getSchool() {
        return school;
    }

    public Son(String name, House house, int age, Family family,String school, String typeOfComputer) {
        super(house, name, age, family);
        this.school = school;
        this.typeOfComputer = typeOfComputer;
    }

    public String getTypeOfComputer() {
        return typeOfComputer;

    }

    @Override
    public void makeWork() {
        System.out.println("Играет игры");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "school" + school +
                "\ntypeOfComputer" + typeOfComputer;
    }
}
