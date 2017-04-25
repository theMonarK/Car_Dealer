package abstractFactory;


/**
 * 
 */
public interface IFactory {

    /**
     * @param model
     * @param mileage
     * @param year
     * @param category
     * @return
     */
    public ICompactCar createCompactCar(String model,int mileage,String category,int year);

    /**
     * @param model
     * @param mileage
     * @param category
     * @param year
     * @return
     */
    public ILimousine createLimousine(String model,int mileage,String category,int year);

    /**
     * @param model
     * @param mileage
     * @param year
     * @param category
     * @return
     */
    public ISUV createSUV(String model,int mileage,String category,int year);

    /**
     * @param model
     * @param mileage
     * @param category
     * @param year
     * @return 
     */
    public IHybrid createHybrid(String model,int mileage,String category,int year);
    
}