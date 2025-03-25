package NewComponents;


public abstract class Factory {
    public abstract Button getButton();
    public abstract Radio getRadio();
    public abstract CheckBox getCheckBox();

    public static Factory getInstance(String os){


        return switch (os.toLowerCase()){
            case "window" -> new WindowFactory();
            case "mac" -> new MacFactory();
            case "linux" -> new LinuxFactory();
            default -> throw new IllegalArgumentException();
        };
    }

    public static String componentReturn(Factory factory,String componentName){
        if(componentName.equalsIgnoreCase("button")){
            Button button = factory.getButton();
            return button.createButton();
        } else if (componentName.equalsIgnoreCase("radiobutton")) {
            Radio radioButton = factory.getRadio();
            return radioButton.createRadio();
        }else if(componentName.equalsIgnoreCase("checkbox")){
            CheckBox checkBox = factory.getCheckBox();
            return checkBox.createCheckBox();
        }else{
            throw new IllegalArgumentException();
        }
    }
}
