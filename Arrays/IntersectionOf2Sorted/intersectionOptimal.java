public class intersectionOptimal {
    public static ArrayList<Integer> intersection(int[] a, int[] b) {
        int i = 0, j = 0;
        int n1 = a.length, n2 = b.length;
        ArrayList<Integer> al = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                if (al.size() == 0 || al.get(al.size() - 1) != a[i]) {
                    al.add(a[i]);
                }
                i++;
                j++;
            }
        }
        return al;
    }
}
