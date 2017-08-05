package helloworld.Ch02_ObjectsClasses.Compilyator;

/**
 * Created by User on 16.07.2017.
 */
class TapeDeck {
    boolean canRecord = false;

    void PlayTape(){
        System.out.println("пленка проигрывается");
    }

    void recordTape(){
        System.out.println("Идет запись");
    }
}
class TapeDeckTestDrive {
    public static void main(String[]args){
        TapeDeck t = new TapeDeck();
        t.canRecord =true;
        t.PlayTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}