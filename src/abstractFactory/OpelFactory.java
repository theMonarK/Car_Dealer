package abstractFactory;


/**
 * 
 */
public class OpelFactory implements IFactory {

    /**
     * Default constructor
     */
    public OpelFactory() {
    }

    @Override
    public ICompactCar createCompactCar(String model,int mileage,String category,int year) {
        return new OpelCompactCar(model,mileage,category,year);
    }

    @Override
    public ILimousine createLimousine(String model,int mileage,String category,int year) {
        return new OpelLimousine(model, mileage, category, year);
    }

    @Override
    public ISUV createSUV(String model,int mileage,String category,int year) {
        return new OpelSUV(model, mileage, category, year);
    }

    @Override
    public IHybrid createHybrid(String model,int mileage,String category,int year) {
        return new OpelHybrid(model, mileage, category, year);
    }
}