package Proxy.SumOfNum;

class Proxy implements Calculate{
    Calculate proxyCalculate =  new Orignal();

    static String role;

    public static void setRole(String r){
        role = r;
    }

    @Override
    public double sumOfNum(int a, int b) {
        if(! "admin".equalsIgnoreCase(role)) {
            throw new RuntimeException("Only Admin can access");
        }

        return this.proxyCalculate.sumOfNum(a,b) ;
    }
}



//Disadvantage : It is needed to add a new class for existing functionality which is Proxy.

//Advantage : It is a Proxy class which called existing method and use that result using output. Ex : Transfer the page based on log in.

