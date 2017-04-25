package abstractFactory;


/**
 * 
 */
public class CarDealer {
    
    /**
     * 
     */
    private IFactory factory;

    /**
     * Default constructor
     */
    public CarDealer() {
    }
    
    public CarDealer(IFactory factory) {
        this.factory = factory;
    }

    public IFactory getFactory() {
        return factory;
    }
    
    
    
   public static void main(String[] args){
       
       IFactory opel = new OpelFactory();
       IFactory peugeot = new PeugeotFactory();
       
       CarDealer carDealer1 = new CarDealer(opel);
       CarDealer carDealer2 = new CarDealer(peugeot);
       
       ICompactCar cc1 = carDealer1.factory.createCompactCar("Astra", 10, "Sports Tourer", 2016);
       ICompactCar cc2 = carDealer2.factory.createCompactCar("106", 10, "GTI", 2010);
       
       IHybrid h1 = carDealer1.factory.createHybrid("Ampera", 100, "", 2017);
       IHybrid h2 = carDealer2.factory.createHybrid("Hybrida", 10, "ECO", 2016);
       
       ISUV suv1 = carDealer1.factory.createSUV("Mokka", 10, "X", 2016);
       ISUV suv2 = carDealer2.factory.createSUV("SUVA", 10, "XXL", 2016);
       
       ILimousine l1 = carDealer1.factory.createLimousine("Limousine", 10, "XL", 2016);
       ILimousine l2 = carDealer2.factory.createLimousine("Limousine", 10, "Large", 2016);
       
       cc1.buy();
       h1.buy();
       suv1.buy();
       l1.buy();
       
       cc2.buy();
       h2.buy();
       suv2.buy();
       l2.buy();
   }

}