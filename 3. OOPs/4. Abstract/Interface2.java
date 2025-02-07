interface camera {
    void takeSnap();
    void recordVideos();
}
interface Wifi {
    String[] getNetworks();
    void connectNetwork(String netrork);
}
class cellPhone {
    void callNumber(int number) {
        System.out.println("Calling: "+number);
    }
    void picCall() {
        System.out.println("Connecting the phone call");
    }
} 
class SmartPhone extends cellPhone implements camera,Wifi {
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
public class Interface2 {
    public static void main(String[] args) {
        SmartPhone obj=new SmartPhone();
        obj.takeSnap();
        obj.recordVideos();
        obj.connectNetwork("TaraDa");
        String[] getNetworks=obj.getNetworks();
        for(String item: getNetworks) {
            System.out.println(item);
        }
    }    
}
