public class Car {

    /* Car attributes */

    /* Primitives */

    private int qtyWheels = 0;
    private int qtyLights = 0;
    private int qtyDoors = 0;
    private String prefixDomain = "A";
    private boolean turnedOn = false;

    /* Non primitives */
    private String brand = "Ford";
    private String fulldomain = null;
    private final String CHASIS_NUM = "ASDFG12345QWERT"; //no lo considera un setter por el final

    /**
     * Constructor
     **/

    public Car(int qtyWheels, int qtyLights, int qtyDoors, String prefixDomain, boolean turnedOn, String brand, String fulldomain) {
        this.qtyWheels = qtyWheels;
        this.qtyLights = qtyLights;
        this.qtyDoors = qtyDoors;
        this.prefixDomain = prefixDomain;
        this.turnedOn = turnedOn;
        this.brand = brand;
        this.fulldomain = fulldomain;
    }

    /**
     * Getters
     **/

    public int getQtyWheels() {
        return qtyWheels;
    }

    public int getQtyLights() {
        return qtyLights;
    }

    public int getQtyDoors() {
        return qtyDoors;
    }

    public String getPrefixDomain() {
        return prefixDomain;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public String getBrand() {
        return brand;
    }

    public String getFulldomain() {
        return fulldomain;
    }

    public String getCHASIS_NUM() {
        return CHASIS_NUM;
    }

    public void setQtyWheels(int qtyWheels) {
        this.qtyWheels = qtyWheels;
    }

    public void setQtyLights(int qtyLights) {
        this.qtyLights = qtyLights;
    }

    public void setQtyDoors(int qtyDoors) {
        this.qtyDoors = qtyDoors;
    }

    public void setPrefixDomain(String prefixDomain) {
        this.prefixDomain = prefixDomain;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFulldomain(String fulldomain) {
        this.fulldomain = fulldomain;
    }

    public void getDoors() {
    }

    public void setDoors(int i) {
    }
}