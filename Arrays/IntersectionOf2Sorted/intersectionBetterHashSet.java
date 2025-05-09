public class intersectionBetterHashSet {
    public static ArrayList<Integer> intersection(int[] a, int[] b) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i : a) {
            hs1.add(i);
        }
        for (int i : b) {
            hs2.add(i);
        }

        for (int i : hs1) {
            if (hs2.contains(i)) {
                al.add(i);
            }
        }
        Collections.sort(al);
        return al;
    }
}
