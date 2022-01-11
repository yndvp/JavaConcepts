package DataStructures;

public class Array {
    public static void main(String[] args) {
        // Creating arrays
        // We can't mix different types of values in one array
        int[] myArray = {1, 33, 4, 12};
        String[] names = {"James", "Lucy", "Julie", "Amy"};

        System.out.println(myArray[3]);
        System.out.println(names[1]);

        // Loop through an array
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Items: " + myArray[i]);
        }

        // Create an empty array -> have to specify the length of the array
        int[] newArray = new int[4];
        newArray[0] = 12;
        newArray[1] = 13;
        newArray[2] = 14;
        newArray[3] = 15;

        CountBackward count = new CountBackward();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        count.countDown(arr);
    }
}
