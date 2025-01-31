class Laptop {

    //1. properties

    //2. behaviour

    void code() {
        System.out.println("Coding in java.....");
    }

    void playMusic(String musicName) {
        System.out.println("Playing music - "+musicName);
    }

    void drawPicture() {
        for(int i = 0; i < 5; i++)
            System.out.print("* ");
    }
}

public class LaptopExample {

    public static void main(String[] args) {

        Laptop laptop = new Laptop(); // physical object created in memory - real building
       
        laptop.code();
        laptop.playMusic("Pushpa Pushpa");
        laptop.playMusic("Music2");

        laptop.drawPicture();

    }
}