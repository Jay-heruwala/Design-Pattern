package DetailCompo;

public class WindowFactory extends Factory{


    @Override
    public  Component getComponentDetails(String Type) {
        Component component = null;
        switch (Type.toLowerCase()){
            case "button":
                component =  new WindowButton();
                break;

            case "radiobutton":
                component = new WindowRadioButton();
                break;

            case "checkbox":
                component = new WindowCheckBox();
                break;
        }
        return component;
    }
}
