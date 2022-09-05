public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        System.out.println();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}
