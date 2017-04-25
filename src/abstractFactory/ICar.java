package abstractFactory;



/**
 * 
 */
public interface ICar {


    /**
     * @return
     */
    public String getBrand();

    /**
     * @return
     */
    public String getModel();

    /**
     * @param value
     */
    public void setModel(String value);

    /**
     * @return
     */
    public double getMileage();

    /**
     * @param value
     */
    public void setMileage(double value);

    /**
     * @return
     */
    public String getCategory();

    /**
     * @param value
     */
    public void setCategory(String value);

    /**
     * @return
     */
    public int getYear();

    /**
     * @param value
     */
    public void setYear(int value);

}