package ChainOfResponsibility.NumberHandler;

public class Manager implements Chain{
    Chain nextInChain;
    @Override
    public void setNext(Chain c) {
        this.nextInChain = c;
    }

    @Override
    public void process(int amount) {
        if(amount < 10000){
            System.out.println(" Handel by Negative Exception : " );
        }else{
            System.out.println("Unable to handel the negative exception");
            nextInChain.process(amount);
        }
    }
}
