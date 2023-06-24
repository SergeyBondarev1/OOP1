import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

     Random random = new Random();
    Hogwarts potter = new Hogwarts("Potter","Гриффендор",
            random.nextInt(101),
            random.nextInt(101));

    Slytherin drako = new Slytherin("Драко","Слизерин",
            random.nextInt(101),
            random.nextInt(101),
            random.nextInt(101),
            random.nextInt(101),
            random.nextInt(101),
            random.nextInt(101),
            random.nextInt(101));
        System.out.println(drako);
        drako.compered(potter);

}
}
