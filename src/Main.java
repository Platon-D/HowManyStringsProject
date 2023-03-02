public class Main {
    public static void main(String[] args) {
        MartinGuitar martinGuitar = new MartinGuitar();
        GibsonGuitar gibsonGuitar = new GibsonGuitar();
        TaylorGuitar taylorGuitar = new TaylorGuitar();
        OvationGuitar ovationGuitar = new OvationGuitar();

        martinGuitar.numberOfStrings();
        taylorGuitar.numberOfStrings();
        gibsonGuitar.numberOfStrings();
        ovationGuitar.numberOfStrings();



        System.out.println("Success. Exit");
        

    }
}
