package Backend16_FactoryDesignpattern;

public  class Flutter {
    void refershUI(){
        System.out.println("Refereshing UI");
    }


    public UIfactory createUIfactory(String platform){
        if(platform.equals("WINDOWS")){
            return new WindowUIFactory();
        }

        return null;
    }

}
