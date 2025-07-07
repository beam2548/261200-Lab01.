public class Main {
    public static void main(String[] args) {
        Turtle t = new Turtle();
        drawLotus(t);
    }

    static void drawLotus(Turtle t) {
        t.speed(1);
        t.up();
        t.forward(50);
        t.right(90);
        t.forward(100);
        t.left(90);
        t.down();

        t.penColor("green");
        t.width(5);
        t.left(90);
        t.forward(100);

        t.up();
        t.forward(20);
        t.right(90);
        t.down();

        t.penColor("pink");
        t.width(2);
        int numPetals = 20;
        double petalLength = 40;
        double petalCurveAngle = 5;
        int numSegments = 10;

        for (int i = 0; i < numPetals; i++) {
            for (int j = 0; j < numSegments; j++) {
                t.forward(petalLength / numSegments);
                t.right(petalCurveAngle);
            }
            for (int j = 0; j < numSegments; j++) {
                t.forward(petalLength / numSegments);
                t.right(petalCurveAngle);
            }
            t.right(180 - (petalCurveAngle * numSegments * 2));
            for (int j = 0; j < numSegments; j++) {
                t.forward(petalLength / numSegments);
                t.right(petalCurveAngle);
            }
            for (int j = 0; j < numSegments; j++) {
                t.forward(petalLength / numSegments);
                t.right(petalCurveAngle);
            }

            t.right(360.0 / numPetals);
        }

        t.up();
        t.backward(80);
        t.left(90);
        t.forward(15);
        t.down();



        t.up();
    }
}