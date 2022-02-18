package quandev.com.DiagonalDifference;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int diagonal1 = 0;
        int diagonal2 = 0;
        int size = arr.size();

        int colTemp1 = 0;
        int colTemp2 = size-1;


        for (List<Integer> integers : arr) {
            for (int j = 0; j < size; j++) {

                if (colTemp1 == j) {
                    diagonal1 += integers.get(j);
                    colTemp1++;
                }

                if (colTemp2 == j) {
                    diagonal2 += integers.get(j);
                    colTemp2--;
                }
            }
        }
        System.out.printf("%.2f", diagonal1/diagonal2);
        return Math.abs(diagonal1 - diagonal2);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT/DiagonalDifference/OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }


}
