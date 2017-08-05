package helloworld.Ch02_ObjectsClasses.Drum;

/**
 * Created by User on 16.07.2017.
 */
class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playSnake(){
        System.out.println("Бах бах ба-бах");
    }
    void playTopHat(){
        System.out.println("динь динь ди-динь");
    }
}
class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d= new DrumKit();
        d.playSnake();
        d.playTopHat();
        d.snare = false;
        if (d.snare == true){
            d.playSnake();
        }
    }
}