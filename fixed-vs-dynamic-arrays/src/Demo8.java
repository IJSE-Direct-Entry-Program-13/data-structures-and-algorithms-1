import java.util.ArrayList;

void main(){
    ArrayList<String> names = new ArrayList<>();
    names.add("Kusal");
    names.add("Kasun");
    names.add("Nuwan");
    names.add("Upul");
    names.add("Ruwan");
    System.out.println(names);
    System.out.println(names.remove("Upul"));
    System.out.println(names.remove("Upul"));
    System.out.println(names);
    System.out.println(names.remove(1));
    System.out.println(names);
    names.clear();
    System.out.println(names);
    System.out.println(names.size());
    System.out.println(names.isEmpty());
}