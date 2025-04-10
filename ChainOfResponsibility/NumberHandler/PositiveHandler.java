package ChainOfResponsibility.NumberHandler;

public class PositiveHandler implements Chain{
    Chain nextInChain;
    @Override
    public void setNext(Chain c) {
        this.nextInChain = c;
    }

    @Override
    public void process(Num request) {
        if(request.getNum() > 0){
            System.out.println(" Handel by Positive Exception : " + request.getNum());
        }else{
            System.out.println("Unable to handel the Positive exception");
            nextInChain.process(request);
        }
    }
}
