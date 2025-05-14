package ChainOfResponsibility.NumberHandler;

public class CEO implements Chain{
    Chain nextInChain;
    @Override
    public void setNext(Chain c) {
        this.nextInChain = c;
    }

    @Override
    public void process(int amount) {
        if(amount > 50000){
            System.out.println(" Handel by Negative Exception : " );
        }else{
            System.out.println("Unable to handel the negative exception");
            nextInChain.process(amount);
        }
    }
}
