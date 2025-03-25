package DetailCompo;

public class LinuxFactory extends Factory{
    @Override
    public Component getComponentDetails(String type) {
        Component component = null;
        switch (type.toLowerCase()){
            case "button":
                component =  new LinuxButton();
                break;

            case "radiobutton":
                component = new LinuxRadioButton();
                break;

            case "checkbox":
                component = new LinuxCheckBox();
                break;
        }
        return component;
    }
}
