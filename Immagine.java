public class Immagine extends ElementoMultimediale implements Luminosità {
    private int luminosità;
    public Immagine(String title, int luminosità) {
        super(title);
        this.luminosità = luminosità;
    }
    public int aumentaLuminosità() {
        return luminosità++;
    }
    public int diminuisciLuminosità() {
        return luminosità--;
    }
    public void show() {
        System.out.print(title);
        for (int j = 0; j < luminosità; j++) {
            System.out.print(" * ");
        }
        System.out.println();
    }
    @Override
    public void play() {

    }
}
