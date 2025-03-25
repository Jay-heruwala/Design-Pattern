package DetailCompo;

public class MacFactory extends Factory{


    @Override
    public  Component getComponentDetails(String Type) {
        Component component = null;
        switch (Type.toLowerCase()){
            case "button":
                component =  new MacButton();
                break;

            case "radiobutton":
                component = new MacRadioButton();
                break;

            case "checkbox":
                component = new MacCheckBox();
                break;
        }
        return component;
    }
}
