public class BmiService {
    public double calculate(Float meters, int kilograms){
        meters = 1.87F;
        kilograms = 98;
        double index = (int) (kilograms / (meters * meters));
        return index;

    }
}
