package Backend16_FactoryDesignpattern;

import Backend16_FactoryDesignpattern.menu.menu;

public interface UIfactory {
    Button createButton();
    menu   createMenu();

    menu Createmenu();
}
