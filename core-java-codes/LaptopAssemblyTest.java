class Keyboard {
    //
}

class LCDScreen {

}

class HardDisk {

}

class Processor {

}

// HAS-A relationship => Composition ( type of association )

class Laptop {

    private int number;
    private String company;
    private int liecenseValidYear;

    private Keyboard keyboard;
    private LCDScreen lcdScreen; // reference variable
    private Processor processor;
    private HardDisk hardDisk;

    public Laptop(Keyboard keyboard, LCDScreen lcdScreen, Processor processor, HardDisk hardDisk) {
        this.keyboard = keyboard;
        this.lcdScreen = lcdScreen;
        this.processor = processor;
        this.hardDisk = hardDisk;
    }



}

public class LaptopAssemblyTest {
    
    public static void main(String[] args) {
        
        Keyboard keyboard = new Keyboard();
        LCDScreen lcdScreen = new LCDScreen();
        Processor processor = new Processor();
        HardDisk hardDisk = new HardDisk();

        Laptop laptop = new Laptop(keyboard, lcdScreen, processor, hardDisk);

    }
}
