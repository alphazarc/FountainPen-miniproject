import java.io.Serializable;
import java.time.Duration;
import java.time.Instant;

public class FountainPen implements Serializable {

    private static final long serialVersionUID = 3828773L;

    private Ink ink;
    private Color color;
    private Duration coolDown;

    /**
     * @param newInk
     * @param newColor
     */

    /**
     * A constructor with no argument.
     */
    public FountainPen() {

    }

    /**
     * @return inkID
     */

    public Ink getInk() {
        return this.ink;
    } //Get Ink info.

    /**
     * @param inkID
     */

    public void setInk(Ink ink) {

        this.ink = ink;
    }

    /**
     * @return color
     */

    public Color getColor() {
        return this.color;
    }//Color info.

    /**
     * @param color
     */

    public void setcolor(Color color) {

        this.color = color;
    }

    /**
     * @return coolDown
     */

    public Duration getcoolDown() {
        return this.coolDown;
    }//Timer for writer.

    /**
     * @param coolDown
     */

    public void setcoolDown(Duration coolDown) {

        this.coolDown = coolDown;
    }

    public void startWriting() {

        // start writing
    }

    public void stopWriting() {

        // stop writing
    }
    //Checks if writer is tired depending on time passed.
    Boolean isWriterTired(Instant startedWritingInstant, Instant currentTimeInstant) {
        Boolean isWriterTired = false;
        Duration timeDuration = Duration.between(startedWritingInstant, currentTimeInstant);
        Duration timeCoolDown = this.coolDown;
        if (timeDuration == timeCoolDown) {
            isWriterTired = true;
        } else {
            isWriterTired = false;
        }
        return isWriterTired;
    }
}
