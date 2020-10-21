import java.io.Serializable;

public class Ink implements Serializable {

    private static final long serialVersionUID = 3828773L;
    private Integer completeAmount = 100;

    private Integer inkID;
    private Integer currentInkAmount;
    private Color colorOfInk;

    /**
     * @param inkID
     * @param currentInkAmount
     * @param colorOfInk
     */

    /**
     * A constructor with no argument.
     */
    public Ink() { //Get Ink info.

    }

    /**
     * @return inkID
     */

    public Integer getInkID() {
        return this.inkID;
    }

    /**
     * @param inkID
     */

    public void setInkID(Integer inkID) {

        this.inkID = inkID;
    }

    /**
     * @return currentInkAmount
     */
    //Check Ink Level.
    public Integer getCurrentInkAmount() {
        return this.currentInkAmount;
    }

    /**
     * @param currentInkAmount
     */

    public void setCurrentInkAmount(Integer currentInkAmount) {

        this.currentInkAmount = currentInkAmount;
    }

    /**
     * @return colorOfInk
     */
    //Check Ink Color
    public Color getColor() {
        return this.colorOfInk;
    }

    /**
     * @param colorOfInk
     */

    public void setColorOfInk(Color colorOfInk) {

        this.colorOfInk = colorOfInk;
    }
    //Refill Ink
    public Boolean refillInk(Integer amount, String colorString) {
        // .... refill ink
        Boolean hasBeenRefilled = null;
        String colorToRefilledWith = this.colorOfInk.getColorName();
        colorToRefilledWith.getBytes();
        if (this.currentInkAmount < 50) {

            Integer amountToBeRefilled = completeAmount - this.currentInkAmount;
            // add refillAmount to inkAmount

            // refil with colorToBeRefilledWith
            if (this.currentInkAmount + amountToBeRefilled == completeAmount) {
                hasBeenRefilled = true;
            } else {
                hasBeenRefilled = false;
            }

        }
        return hasBeenRefilled;
    }
}
