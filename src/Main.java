public class Main {
    public static void main(String[] args) {

        Family family = new Family(38, "Alex");
        Father father = new Father(House.AVERAGE, "Misha", 36, family);
        father.makeWork();
        father.makeWork("Пишет код");
        System.out.println(father.getInfo());
        Family family1 = new Family(45, "Sasha");
        Son son = new Son("Alim", House.BIG, 15, family1, "Kadurov", "Acer");
        son.makeWork();
        son.makeWork("Играет игры");
        System.out.println(son.getInfo());
        Family family2 = new Family(50, "Nurs");
        Son son1 = new Son("Adilet", House.SMALL, 18, family2, "Gim", "Windows");
        son1.makeWork();
        son1.makeWork("Работает");
        System.out.println(son1.getInfo());
    }

}
