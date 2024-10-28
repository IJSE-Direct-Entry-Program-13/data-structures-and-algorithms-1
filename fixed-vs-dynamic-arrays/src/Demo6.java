import java.util.Arrays;

void main() {
    int[] values = {10,20};
    values = add(values, 30);
    values = add(values, 40);
    System.out.println(Arrays.toString(values));
    values = remove(values, 2);
    System.out.println(Arrays.toString(values));
}

int[] add(int[] array, int value) {
    int[] newArray = new int[array.length + 1];
    for (int i = 0; i < array.length; i++) {
        newArray[i] = array[i];
    }
    newArray[array.length] = value;
    return newArray;
}

int[] remove(int[] array, int index) {
    int[] newArray = new int[array.length - 1];
    for (int i = 0; i < array.length; i++) {
        if (i == index) continue;
        newArray[i < index ? i : i - 1] = array[i];
    }
    return newArray;
}