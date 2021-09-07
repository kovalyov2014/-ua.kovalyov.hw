//package ua.kovalyov.hw4;
//
//import java.util.Arrays;
//
//public class Task2 {
//    public static void main(String[] args) {
//        int[] initialArray = new int[1000];
//        fillArray(initialArray);
//        int[] copiedArray = Arrays.copyOf(initialArray, initialArray.length);
//        System.out.println(Arrays.toString(copiedArray));
//        System.out.println("Number of primes: " + primeNumber(copiedArray));
//    }
//
//    public static int[] fillArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 1001);
//        }
//        return array;
//    }
//
//    public static int primeNumber(int[] array) {
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            boolean isPrime = true;
//            if (array[i] < 2) {
//                isPrime = false;
//            } else {
//                for (int j = 2; j <= array[i] / 2; j++) {
//                    if (array[i] % j == 0) {
//                        isPrime = false;
//                        break;
//                    }
//                }
//            }
//            if (isPrime) {
//                count++;
//            }
//        }
//        return count;
//    }
//}