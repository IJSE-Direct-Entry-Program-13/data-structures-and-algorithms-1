import java.util.Arrays;
import java.util.List;

void main(){
    int x;
    int[] array;
    array = new int[4];
    System.out.println(array);
    System.out.println(array.length);
    System.out.println(array[-5+5]);    // array[0]
    System.out.println(array[1]);    // array[1]
    System.out.println(array[2]);    // array[1]
    System.out.println(array[3]);    // array[1]

    // Following line will cause ArrayIndexOutOfBoundsException
    //System.out.println(array[-5]);    // array[1]
    //System.out.println(array[10]);    // array[1]

    System.out.println("==============");
    System.out.println(array[2]);
    array[10 / 5] = 5;
    System.out.println(array[2]);
    System.out.println("==============");

    for (int i = 0; i < array.length; i++) {
        System.out.println(i + ": " +  array[i]);
    }

    System.out.println(Arrays.toString(array));
    System.out.println("==============");

    System.out.println(new String[]{"cmjd", "dep", "gdse"}[1]);
    System.out.println(new String[4][2]);
    System.out.println((new int[4])[2]);

}