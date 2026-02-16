public class StringFormatApp {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double height = Double.parseDouble(args[2]);
        System.out.printf("name: %-20s Age: %3d Height: %4.2fm%n", name, age, height);

        double spaceHeight = ((height * 1.023)*100);
        System.out.printf("My space height would be %.1fcm%n", spaceHeight);

        int martianAge = (int) Math.round(age / 1.88);
        System.out.printf("On Mars I would be approximately %s years old.%n", martianAge);
    }
}