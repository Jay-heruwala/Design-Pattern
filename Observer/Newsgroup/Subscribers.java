package Observer.Newsgroup;

public class Subscribers implements Observer {

    String user;

    Subscribers(String user){
        this.user = user;
    }


    @Override
    public void update(String msg) {
        System.out.println(user + "  " + msg);
    }
}
