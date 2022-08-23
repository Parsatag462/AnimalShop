public class BakeryDriver {
    public static void main(String[] args) {
        Cookie c1 = new Cookie("Chocolate Chip", 3.00);
        Cookie c2 = new Cookie("Oatmeal", 2.00);
        Cookie c3 = new Cookie("Oatmeal Raisin", 2.50);

        System.out.println(c1.getDepartment());
        System.out.println(c1.getItemName());
        System.out.println(c1.getType());
        System.out.println(c1.getPrice());
        c1.setPrice(2.75);
        System.out.println(c1.getPrice());

        System.out.println();
        System.out.println(c2.getDepartment());
        System.out.println(c2.getItemName());
        System.out.println(c2.getType());
        System.out.println(c2.getPrice());

        System.out.println();
        System.out.println(c3.getDepartment());
        System.out.println(c3.getItemName());
        System.out.println(c3.getType());
        System.out.println(c3.getPrice());
    }
}
