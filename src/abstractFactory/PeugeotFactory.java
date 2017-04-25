package abstractFactory;


/**
 * 
 */
public class PeugeotFactory implements IFactory {

    /**
     * Default constructor
     */
    public PeugeotFactory() {
    }

    @Override
    public ICompactCar createCompactCar(String model,int mileage,String category,int year) {
        return new PeugeotCompactCar(model, mileage, category, year);
    }

    @Override
    public ILimousine createLimousine(String model,int mileage,String category,int year) {
        return new PeugeotLimousine(model, mileage, category, year);
    }

    @Override
    public ISUV createSUV(String model,int mileage,String category,int year) {
        return new PeugeotSUV(model, mileage, category, year);
    }

    @Override
    public IHybrid createHybrid(String model,int mileage,String category,int year) {
        return new PeugeotHybrid(model, mileage, category, year);
    }
}