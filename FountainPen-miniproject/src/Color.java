import java.io.Serializable;

public class Color implements Serializable {

    private static final long serialVersionUID = 3828773L;

    private Integer colorID;
    private String colorName;
    private String colorHex;

    /**
     * @param colorID
     * @param colorName
     * @param colorHex
     */

    /**
     * A constructor with no argument.
     */
    public Color() { //Choose Ink Color.

    }

    /**
     * @return colorID
     */

    public Integer getColorID() {
        return this.colorID;
    } //Input Color ID

    /**
     * @param colorID
     */

    public void setColorID(Integer colorID) {

        this.colorID = colorID;
    }

    /**
     * @return colorName
     */

    public String getColorName() {
        return this.colorName;
    } //Input Color Name.

    /**
     * @param colorName
     */

    public void setColorName(String colorName) {

        this.colorName = colorName;
    }

    /**
     * @return colorHex
     */

    public String getColorHex() {
        return this.colorHex;
    } //Input Color Hex Code.

    /**
     * @param colorHex
     */

    public void setColorHex(String colorHex) {

        this.colorHex = colorHex;
    }

}
