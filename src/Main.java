public class Main {

    public static void main(String[] args) {
        String [][] array = new String[4][4];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = "Строка " + j;
                System.out.println(array[i][j] + " ");
            }
        }
        try {
            try {
                int sum = MyArr.getArr(array);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }




}