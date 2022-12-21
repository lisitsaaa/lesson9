package task1.main;

import task1.coordinateSystem.Vector;
import task1.coordinateSystem.SystemForThreePoints;
import task1.coordinateSystem.SystemForTwoPoints;

public class Main {
    public static void main(String[] args) {
        Vector s1 = new SystemForTwoPoints();
        Vector s2 = new SystemForTwoPoints(5,5);
        s1.printInformation(s1,s2);
        System.out.println();

        Vector s3 = new SystemForThreePoints();
        Vector s4 = new SystemForThreePoints(10,10,10);
        s3.printInformation(s3,s4);


    }
}
