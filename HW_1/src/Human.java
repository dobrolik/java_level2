public class Human implements Actions {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Human(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println(this.name + " бежит " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println(this.name + " прыгает " + this.getJumpHeight());
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }

}