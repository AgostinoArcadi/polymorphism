public class Triangolo extends Forma {

    public Triangolo(int base, int altezza) {
        super(base, altezza);
    }

    @Override
    public void calcolaArea() {
        System.out.println((getBase() * getAltezza()) / 2);
    }
}
