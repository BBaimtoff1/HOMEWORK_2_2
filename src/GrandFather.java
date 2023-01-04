public class GrandFather {

    public String getName() {
        return name;
    }

    public House getHouse() {
        return house;
    }

    private House house;
    private String name;

    public GrandFather(House house, String name) {
        this.house = house;
        this.name = name;
    }
}
