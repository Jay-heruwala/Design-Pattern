package Observer.WeatherDevices;

public class WeatherStation extends Subject{

    String msg;

    @Override
    void attach(Observer o) {
        observers.add(o);
    }

    @Override
    void detach(Observer o) {
        observers.remove(o);
    }

    void setMsg(String msg){
        this.msg = msg;
        notifyDevices();
    }

    public String getMsg(){
        return this.msg;
    }

    @Override
    void notifyDevices() {
        for(Observer observer : observers){
            observer.update(this.msg);
        }
    }
}
