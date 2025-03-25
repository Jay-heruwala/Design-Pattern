package NewComponents;

public class WindowFactory extends Factory {



    @Override
    public Radio getRadio() {
        return new WindowRadio();
    }

    @Override
    public CheckBox getCheckBox() {
        return new WindowCheckBox();
    }
    @Override
    public Button getButton() {
        return new WindowButton();
    }


}
