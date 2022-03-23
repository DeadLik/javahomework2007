package homework2_2;

public class App {

    public static void main(String[] args) {

        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"2", "3", "2", "5"}, {"4", "8", "2", "3"}, {"4", "6", "3", "8"}};
        try {
            Method(arr);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }


    }

    public static int Method(String[][] arr) throws MyArrayDataException, MyArraySizeException {

        int count = 0;

        if (arr.length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    count += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        System.out.print(count);
        return 0;
    }

}
