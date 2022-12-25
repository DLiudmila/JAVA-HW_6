import java.util.*;

public class HW6 {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Один");
        hashSet.add("Два");
        hashSet.add("Три");
        hashSet.add("Четыре");
        hashSet.add("Пять");
        System.out.println("HashSet: "+hashSet);

        Iterator<String> it = hashSet.iterator();
        ArrayList<String> arrayList = new ArrayList();
        while (it.hasNext()){
            arrayList.add(it.next());
        }
        Collections.sort(arrayList);

        Set<String> linked = new LinkedHashSet<>();
        linked.addAll(arrayList);
        System.out.println("LinkedHashSet: "+linked);

        Set<String> tree = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) { return 0;}
                //Обратный порядок
                return o1.compareTo(o2)*(-1);
            }
        });

        tree.addAll(hashSet);
        System.out.println("TreeSet: "+tree);
    }
}
