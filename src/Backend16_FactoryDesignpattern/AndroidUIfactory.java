package Backend16_FactoryDesignpattern;

public abstract class AndroidUIfactory  implements UIfactory{
    @Override
    public Button createButton() {
      return new WindowsButton();
    }
}
