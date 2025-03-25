package NewComponents;

public class LinuxFactory extends Factory {

    @Override
    public Button getButton() {
        return new LinuxButton();
    }

    @Override
    public Radio getRadio() {
        return new LinuxRadio();
    }

    @Override
    public CheckBox getCheckBox() {
        return new LinuxCheckBox();
    }


}
