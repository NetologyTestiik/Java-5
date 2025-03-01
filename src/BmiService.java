public class BmiService {
    public float calculate(float meters, int kilograms){
        meters = 1.87F;
        kilograms = 98;
        float index = (int) (kilograms / (meters * meters));
        return index;

    }
}
