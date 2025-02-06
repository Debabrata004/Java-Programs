package Sir.Akshay;

interface MusicPlayer{
    void playSong();
    void pauseSong();
}
interface Camera{
    void takePicture();
    void takeVideo();
}
class SmartPhone implements MusicPlayer,Camera{
    @Override
    public void takePicture() {

    }

    @Override
    public void takeVideo() {

    }

    @Override
    public void playSong() {

    }

    @Override
    public void pauseSong() {

    }

}
public class MultipleInheritance {
    public static void main(String[] args) {
        SmartPhone sp=new SmartPhone();

    }
}
