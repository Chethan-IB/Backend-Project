package Backend16_FactoryDesignpattern;

import Backend16_FactoryDesignpattern.menu.Windowsmenu;
import Backend16_FactoryDesignpattern.menu.menu;

public abstract  class WindowUIFactory implements UIfactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public menu Createmenu(){
        return new Windowsmenu();
    }
}
