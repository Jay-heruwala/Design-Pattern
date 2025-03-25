package DetailCompo;

public abstract class Factory {

    public abstract Component getComponentDetails(String Type);



    public static Factory getInstance(String Os){
        Factory factory = null;
        switch (Os.toLowerCase()){
            case "window":
                factory = new WindowFactory();
                break;

            case "linux":
                factory = new LinuxFactory();
                break;

            case "mac":
                factory = new MacFactory();
                break;
        }
        return factory;
    }
}
