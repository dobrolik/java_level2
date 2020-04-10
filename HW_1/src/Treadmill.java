public class Treadmill extends Barrier {
    private int length;

    public Treadmill(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Беговая дрпржка " + super.getName() + " длина: " + this.length);

        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("Успешный забег!");

            return true;
        } else {
            System.out.println("Не прошёл:(");

            return false;
        }
    }
}