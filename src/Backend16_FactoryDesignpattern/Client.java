package Backend16_FactoryDesignpattern;

import Backend16_FactoryDesignpattern.menu.menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIfactory uifactory = flutter.createUIfactory("IOS");

        Button button = uifactory.createButton();
        menu menu = uifactory.createMenu();

        button.clickbutton();
        menu.showmenu();


    }
}
