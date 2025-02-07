interface camera2 {
    void takeSnap();
    void recordVideos();
}
interface Wifi2 {
    String[] getNetworks();
    void connectNetwork(String netrork);
}
class cellPhone2 {
    void callNumber(int number) {
        System.out.println("Calling: "+number);
    }
    void picCall() {
        System.out.println("Connecting the phone call");
    }
} 
class SmartPhone2 extends cellPhone2 implements camera2,Wifi2 {
    public void takeSnap() {
        System.out.println("It is taking snap pictures.");
    }
    public void recordVideos() {
        System.out.println("It is recording videoes.");
    }
    public String[] getNetworks() {
        System.out.println("Gettings the list of network is: ");
        String[] networkList={"Anshu","Arnab","Asim","Mir"};
        return networkList;
    }
    public void connectNetwork(String network) {
        System.out.println("The network name is: "+network);
    }
}
public class Polymorphism_Interface {
    public static void main(String[] args) {
        camera2 obj=new SmartPhone2();      // This is  a smart phone but please use it as a camera.
        obj.takeSnap();
        obj.recordVideos();
        //obj.connectNetwork("TaraDa");           // It is not allowed.
        //String[] getNetworks=obj.getNetworks(); // It is not allowed.
        //for(String item: getNetworks) {
        //    System.out.println(item);
        //}
    }    
}
