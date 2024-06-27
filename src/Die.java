/*
 * Name: ภัควัฒน์ ปานกลาง
 * Student ID: 6510450763
 */

import java.util.Random;

public class Die {
    private int faceValue;

    public Die() {
        faceValue = 0;
    }
    public void roll() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(6) + 1;
        setFaceValue(randomNumber);
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }
}
