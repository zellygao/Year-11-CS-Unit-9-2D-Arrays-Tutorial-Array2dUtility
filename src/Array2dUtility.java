
public class Array2dUtility {

    // Declare all methods as static.
    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] arr2d) {
        for (int[] row : arr2d) {
            for (int col : row) {
                System.out.println(col);
            }
            System.out.println();
        }
    }
    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers

    public static int sum(int[][] arr2d) {
        int sum = 0;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                sum += arr2d[i][j];
            }
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.

    public static double average(int[][] arr2d) {
        int total = 0;
        for (int[] row : arr2d) {
            for (int col : row) {
                total++;
            }
        }
        return ((double) sum(arr2d) / total);
    }


    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] arr2d) {
        int min = arr2d[0][0];
        for (int[] row : arr2d) {
            for (int col : row) {
                if (col < min) {
                    min = col;
                }
            }
        }
        return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] arr2d) {
        int max = 0;
        for (int[] row : arr2d) {
            for (int col : row) {
                if (col > max) {
                    max = col;
                }
            }
        }
        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] arr2d) {
        int count = 0;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (arr2d[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] arr2d) {
        int count = 0;
        for (int[] row : arr2d) {
            for (int col : row) {
                if (col % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] arr2d) {
        boolean check = true;
        for (int[] row : arr2d) {
            for (int col : row) {
                if (col < 0) {
                    check = false;
                }
            }
        }
        return check;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] arr2d) {
        int[] arr = new int[arr2d.length];
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                arr[i] += arr2d[i][j];
            }
        }
        return arr;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] arr2d) {
        int[] colSums = new int[arr2d[0].length];

        for (int j = 0; j < arr2d[0].length; j++) {
            int sum = 0;

            for (int i = 0; i < arr2d.length; i++) {
                sum += arr2d[i][j];

            colSums[j] = sum;
        }

        return colSums;
    }
}

