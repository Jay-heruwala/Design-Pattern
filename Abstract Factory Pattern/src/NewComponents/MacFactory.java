package NewComponents;

public class MacFactory extends Factory {

    @Override
    public Button getButton() {
        return new MacButton();
    }

    @Override
    public Radio getRadio() {
        return new MacRadio();
    }

    @Override
    public CheckBox getCheckBox() {
        return new MacCheckBox();
    }


}
