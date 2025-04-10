package ChainOfResponsibility.NumberHandler;

public class NegativeHandler implements Chain{
    Chain nextInChain;
    @Override
    public void setNext(Chain c) {
        this.nextInChain = c;
    }

    @Override
    public void process(Num request) {
        if(request.getNum() < 0){
            System.out.println(" Handel by Negative Exception : " + request.getNum());
        }else{
            System.out.println("Unable to handel the negative exception");
            nextInChain.process(request);
        }
    }
}
