public class Tests {

    public static void main(String[] args) {

        GamePiece test = new GamePiece();

        test.setName("blue piece");
        test.setColor("blue");
        System.out.println("Position X is " + test.getPositionX());
        System.out.println("Positon Y is " + test.getPositionY());
        System.out.println("Is the piece frozen?" + test.getFrozen());

        System.out.println("Did the piece move?" + test.move(5, 7));

    }
}
