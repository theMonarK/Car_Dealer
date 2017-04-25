package abstractFactory;


/**
 * 
 */
public class OpelLimousine implements ILimousine,ICar {
    
    /**
     * 
     */
    protected String brand = "Opel";

    /**
     * 
     */
    protected String model;

    /**
     * 
     */
    protected double mileage;

    /**
     * 
     */
    protected String category;

    /**
     * 
     */
    protected int year;

    /**
     * 
     */
    protected boolean isSold = false;

    /**
     * Default constructor
     */
    public OpelLimousine() {
    }

    public OpelLimousine(String model, double mileage, String category, int year) {
        this.model = model;
        this.mileage = mileage;
        this.category = category;
        this.year = year;
    }
    
    

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double getMileage() {
        return this.mileage;
    }

    @Override
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public String getCategory() {
        return this.category;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int getYear() {
        return this.year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void buy() {
        this.isSold = true;
        System.out.println("Buy "+this.brand+" "+this.model);
    }

}