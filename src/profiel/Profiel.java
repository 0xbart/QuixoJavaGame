package profiel;

/**
 * Created by Bart on 10-4-2014.
 */
public class Profiel {

    private String strSpeler1;
    private String strSpeler2;
    private String strTypeSpeler1;
    private String strTypeSpeler2;
    private int spelData[] = {
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0
    };

    public String getStrSpeler1() {
        return strSpeler1;
    }

    public void setStrSpeler1(String strSpeler1) {
        this.strSpeler1 = strSpeler1;
    }

    public String getStrSpeler2() {
        return strSpeler2;
    }

    public void setStrSpeler2(String strSpeler2) {
        this.strSpeler2 = strSpeler2;
    }

    public String getStrTypeSpeler1() {
        return strTypeSpeler1;
    }

    public void setStrTypeSpeler1(String strTypeSpeler1) {
        this.strTypeSpeler1 = strTypeSpeler1;
    }

    public String getStrTypeSpeler2() {
        return strTypeSpeler2;
    }

    public void setStrTypeSpeler2(String strTypeSpeler2) {
        this.strTypeSpeler2 = strTypeSpeler2;
    }

    public int[] getSpelData() {
        return spelData;
    }

    public void setSpelData(int[] spelData) {
        this.spelData = spelData;
    }
}
