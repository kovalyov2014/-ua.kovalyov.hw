public class Task5 {
    public static void main(String[] args) {

        // часть 1 - создаем матрицу n на n
        int n = 3;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = n*i + j;
            }
        }

        // часть 2 - выводит на экран начальную матрицу
        System.out.println("Начальная матрица");
        System.out.println("------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

        // часть 3 - транспонирование матрицы
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // часть 4 - выводит на экран транспонированную матрицу
        System.out.println();
        System.out.println("Новая матрица");
        System.out.println("------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
        int[] Mas=new int[4];
        //С помощью первого цикла заполним значения елементов массива
        for(int i=0;i<Mas.length;i++){
            Mas[i]=(int)(Math.random()*90+10);
            System.out.print(Mas[i]+" ");
        }
        //С помощью второго цикла переберем по очереди значения елементов массива
        for(int i=0;i<Mas.length;i++){
            //Если следующий элемент меньше или равен предыдущему, цикл прерывается и выводится сообщение о том, что прогрессия не возрастающая
            if(i>0){
                if(Mas[i-1]>=Mas[i]){
                    System.out.println("Прогрессия не возрастающая");
                    break;

                }
            }
            //Если перебрали все значения элементов массива и цикл не прервался - выводим сообщение о том, что последовательность возрастающая
            if(i==Mas.length-1)
                System.out.println("Последовательность строго возрастающая");
        }
    }
}
