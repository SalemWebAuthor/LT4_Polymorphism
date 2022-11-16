public class Main {
    public static void main(String[] args) {

        WoodFurniture wf = new WoodFurniture();
        WoodFurniture ca = new Cabinet();
        WoodFurniture ch = new Chair();
        WoodFurniture ta = new Table();
        WoodFurniture sh = new Shelf();

        wf.description();
        wf.WoodType();
        wf.finish();
        System.out.println("");
        ca.description();
        ca.WoodType();
        ca.finish();
        System.out.println("");
        ch.description();
        ch.WoodType();
        ch.finish();
        System.out.println("");
        ta.description();
        ta.WoodType();
        ta.finish();
        System.out.println("");
        sh.description();
        sh.WoodType();
        sh.finish();
    }
}