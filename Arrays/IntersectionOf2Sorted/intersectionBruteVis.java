public class intersectionBruteVis {
    public static ArrayList<Integer> intersection(int[] a, int[] b) {
        ArrayList<Integer> al = new ArrayList<>();
        int n1 = a.length, n2 = b.length;
        int[] vis = new int[n2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if ((a[i] == b[j] && vis[j] == 0) && (al.size() == 0 || al.get(al.size() - 1) != a[i])) {
                    al.add(a[i]);
                    vis[j] = 1;
                    break;
                } else if (a[i] < b[j]) {
                    break;
                }
            }
        }
        return al;
    }
}
