public class Main {
    public static void main(String[] args) {

       float[] temp = new float[30];

        for (int i = 0; i < temp.length ; i++) {
            temp[i] = 32 +(float)(Math.random()*(40-32)+1);
        }

        for (int i = 0; i < temp.length ; i++) {
            System.out.printf("%.2f", temp[i]);
            System.out.println("");
        }

        float sum = 0;
        for (int i = 0; i <temp.length ; i++) {
            sum += temp[i];
        }
            float average = sum/temp.length;
                String stringAverage = String.format("%.2f", average);
            System.out.println("Средняя температура по больнице равна " + stringAverage + "°С");

            int count = 0;
        for (int i = 0; i <temp.length ; i++) {
            if(temp[i] >= 36.2 && temp[i] <= 36.9) {
                count++;
            }
        }
        System.out.println("Число здоровых пациентов: " + count);
    }
}
