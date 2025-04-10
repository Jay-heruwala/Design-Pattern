package ChainOfResponsibility.NumberHandler;

public class ZeroHandler implements Chain{
    Chain nextInChain;
    @Override
    public void setNext(Chain c) {
        this.nextInChain = c;
    }

    @Override
    public void process(Num request) {
        if(request.getNum() < 0){
            System.out.println(" Handel by Zero Exception : " + request.getNum());
        }else{
            System.out.println("Unable to handel the Zero exception");
            nextInChain.process(request);
        }
    }
}
