public class Main {

    public static void main(String[] args) {

        String[] myArray = {"Honda", "Kawasaki", "Nissan", "Toyota", "KTM", "Yamaha"};
        String shortestString = myArray[0];

        for (int i = 0; i < myArray.length; i++){
            if(myArray[i].length() <= shortestString.length()) {
                shortestString = myArray[i];
            }
        }
        System.out.println(shortestString);

    }
}