public class Tests {

    public static void main(String[] args) {

        GamePiece test = new GamePiece();

        System.out.println("FROZ = " + test.getFrozen());
        if (!test.getFrozen()) {
            test.freeze();
            if (test.getFrozen()) {
                System.out.println("verified that the piece has frozen");
            } else {
                System.out.println("failed verification");
            }
        }

        System.out.println(" NOT FROZ = " + test.getFrozen());
        if (test.getFrozen()) {
            test.unfreeze();
            if (!test.getFrozen()) {
                System.out.println("verified that the piece has been unfrozen");
            } else {
                System.out.println("failed verification");
            }
        }

        System.out.println("Did it move? = " + test.getPositionX() + test.getPositionY());
        if (!test.getFrozen()) {
            test.move(10, 33);
            if (test.getPositionX() == 10 && test.getPositionY() == 33) {
                System.out.println("the position has been changed");
            } else {
                System.out.println("failed verification");
            }
        }

        System.out.println("Did it stay put? = " + test.getPositionX() + " and " + test.getPositionY());
        if (test.getFrozen()) {
            test.move(test.getPositionX() + 10, test.getPositionY() + 10);
            if (test.getPositionX() == 10 && test.getPositionY() == 33) {
                System.out.println("the position has not been changed");
            } else {
                System.out.println("failed verification");
            }
        }

    }
}

