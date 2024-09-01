package LectureExamples;

public class ArrayExamples {

    public static void main(String[] args){
        // Declare and initialize an array of 10 String object
        String[] words = new String[10];

        // Set position zero to hold "Apple"
        words[0] = "Apple";

        System.out.println();
        // Print the string at position zero
        System.out.println(words[0]);
        // Not initialized element has null
        System.out.println(words[1]);    

        // Initializer list, 10 
        int[] units = {147, 323, 89, 933, 540, 269, 97, 114, 298, 476};
        //int[] units = new int[10];


        // Loop over the array and print each string.
        // Note the use of words.length field to get the current length of the array
        for(int i = 0; i < words.length; i++ ){
           System.out.println(words[i]);
        }

        // For each looping style also works
        for (String word : words){
           System.out.println(word);
        }


        // get the length of the array 
        System.out.println(words.length);
        System.out.println(words[0].length());

        
        
        // You can also create arrays of arrays  
        double[][] matrix = new double[4][4];
        for(int i = 0; i < matrix.length; i++ ){
            for(int j = 0; j < matrix[i].length; j++ ){
                matrix[i][j] = i*j;
            }
        }

        // Array can also be multidimensional - like three dimension array to represent an image matrix with color, or sometimes spatial information, when you want to represent x,y,z coordinates 
        int[][][] image_matrix = new int[5][5][3]; // a 5x5 image with rgb colors 
        for(int i = 0; i < image_matrix.length; i++ ){
            for(int j = 0; j < image_matrix[i].length; j++ ){
                for(int k = 0; k < image_matrix[i][j].length; k++){
                    image_matrix[i][j][k] = 50;
                }
            }
        }

        // int[] units = {147, 323, 89, 933, 540, 269, 97, 114, 298, 476};
        // If we want to create a new copy of the array, the regular assignment is only creating a copy of the reference
        int[] units2 = units;
        
        // Which is saying if we modified the original array the copy also get modified (as they are pointing to the same memory location)
        System.out.println(units[0]);
        
        // also, when an array is passed to a function call, it is also passing by reference (which is different from passing by values)
        modifyArray(units);
        System.out.println(units[0]);
        System.out.println(units2[0]);

        // if we want to create a copy of the array's elements, not a copy of the refernece, we can use clone method 
        int[] units3 = units.clone();


        // Characters are stored as numbers in Java (similar to other computer science language), following the ascii tablet 
        // so when you compare characters to characters, or characters to numbers, Java is actually looking up their ascii 
        // values and do the comparison
         if ('Q' > 81){
            System.out.println("Q is greater than 81");
        } else if ('Q' < 81){
            System.out.println("Q is smaller than 81");
        } else {
            System.out.println("Q equals 81");
        }

        if ('A' > 'a'){
            System.out.println("A is greater than a");
        } else {
            System.out.println("A is smalelr than a");
        }

        // variable length parameter list is something helpful when you want a function to work with various lengths of inputs
        // both averageInt and averageInt2 are calculating averages, but one is defined using parameter list one is using 
        // traditional array. As you can see using parameter list is simpler when calling the method, as java will help put 
        // all parameters in an array and pass to the function call
        int avg = averageInt(2,4,5);
        
        int[] nums = {2,4,5};
        int avg2 = averageInt2(nums);

    }

    // to demo pass by reference
    static void modifyArray(int[] array){
        array[0] = 0;
    }

    // to demo parameter list - this version used parameter list
    static int averageInt(int ... nums){
        int avg = 0;
        for (int num:nums){
            avg+= num;
        }
        avg = avg/nums.length;
        return avg;
    }

    // to demo parameter list - this version used array
    static int averageInt2(int[] nums){
        int avg = 0;
        for (int num:nums){
            avg+= num;
        }
        avg = avg/nums.length;
        return avg;
    }
}