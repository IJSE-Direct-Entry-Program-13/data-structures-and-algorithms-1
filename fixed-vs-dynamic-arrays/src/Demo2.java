void main(){
    System.out.println(new int[5]);
    System.out.println(new int[0]);
    //System.out.println(new int[-5]);    //NegativeArraySizeException

    // You can't specify the array size with array initializer
    // System.out.println(new int[0]{});
    System.out.println(new int[]{});
    //System.out.println(new int[3]{10,20,30});
    System.out.println(new int[]{10,20,30});

    // System.out.println({10,20,30,40});
    int[] array1 = {10,20,30,40};

    int[] array2;
    // array2= {20,30,40,50}; // Array Initializer syntax is only allowed as the variable initializer

    // var array3 = {10,20,30,40};
    var array4 = new int[]{10,20,30,40};
    System.out.println(array1 instanceof Object);   // Java Arrays are objects
}