public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int meters = (int) 1.87;
        int kilograms = 98;
        int index = (int) service.calculate((float) meters,kilograms);
        System.out.println("Индекс:" + index);

    }
}