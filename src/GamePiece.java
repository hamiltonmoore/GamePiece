public class GamePiece {

    private int positionX;
    private int positionY;
    private boolean frozen;
    private String name;
    private String color;

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
        this.name = name;
        this.color = color;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean getFrozen() {
        return frozen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //begin the methods of behavior for the game piece
    public void move(int positionX, int positionY) {
        if (!frozen) {
            this.positionX = positionX;
            this.positionY = positionY;
        }
        else {
            System.out.println("Haha you're frozen!");
        }
    }

    public void freeze() {
        this.frozen = true;
    }

    public void unfreeze() {
        this.frozen = false;
    }

    //when the piece is frozen, change move so that the piece doesn't move


}
