package Backend16_FactoryDesignpattern;

public class IOSbutton implements Button {
    @Override
    public void clickbutton() {
        System.out.println("IOS Button Clicked");
    }
}
