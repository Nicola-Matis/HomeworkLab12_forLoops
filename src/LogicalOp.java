public class LogicalOp {

    //1

    public void FromNumberTo100(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    //2

    public void FromNumberToMinus100(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    //3

    public void FromNumberToAnotherNumber(int number, int secondNumber) {
        for (int i = number; i <= secondNumber; i++) {
            System.out.println(i);
        }
    }

    //4

    public void ez(int number, int secondNumber) {
        for (int i = number; i <= secondNumber; i++) {
            System.out.println(i);
        }
        for (int i2 = secondNumber; i2 <= number; i2++) {
            System.out.println(i2);
        }
    }

    //5

    public void EvenTo100(int number) {
        for (int i = number; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //6

    public void OddTo100(int number) {
        for (int i = number; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //7

    int sum = 0;

    public void SumTo100(int number) {
        for (int i = number; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    //8

    float summ = 0;

    public void AverageTo100(float number) {
        for (float i = number; i <= 100; i++) {
            summ = summ + i;
        }
        System.out.println(summ / 100f);
    }

    //9


}
