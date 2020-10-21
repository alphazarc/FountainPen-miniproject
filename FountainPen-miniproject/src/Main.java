//Name: Alp Hazar CAKIR
//Neptun Code:NCWYZC
//Fountain Pen mini project.

import java.time.Instant;
public class Main {
    //Main Function
    public static void main(String[] args) {
        Color newColor = new Color();

        newColor.setColorID(1);
        newColor.setColorName("blue");

        Ink newInk = new Ink();

        newInk.setColorOfInk(newColor);
        newInk.setInkID(01);
        newInk.setCurrentInkAmount(47);

        newInk.refillInk(newInk.getCurrentInkAmount(), newInk.getColor().getColorName());

        FountainPen newFountainPen = new FountainPen();
        Instant startedWritingInstant = Instant.now();

        newFountainPen.setInk(newInk);
        newFountainPen.setcolor(newInk.getColor());
        newFountainPen.startWriting();

        Instant currentTimeInstant = Instant.now();
        newFountainPen.stopWriting();

        newFountainPen.isWriterTired(startedWritingInstant, currentTimeInstant);

    }
}
