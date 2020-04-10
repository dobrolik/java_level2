import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int distance = random.nextInt(10);
        int heigth = random.nextInt(10);

        Actions[] actions = new Actions[3];
        actions[0] = new Cat("Бася", 4, 8);
        actions[1] = new Human("Дениска", 6, 4);
        actions[2] = new Robot("Вертер", 10, 2);

        Barrier[] barriers = new Barrier[6];

        boolean isTreadmill;
        for (int i = 0; i < barriers.length; i++) {
            distance = random.nextInt(10);
            isTreadmill = random.nextBoolean();
            if (isTreadmill) {
                barriers[i] = new Treadmill("Попытка " + i, distance);
            } else {
                barriers[i] = new Wall("Попытка " + i, distance);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {

                result = barriers[j].moving(actions[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Ура!");
                System.out.println();
            } else {
                System.out.println("Увы!:(");
                System.out.println();
            }
        }
    }
}

