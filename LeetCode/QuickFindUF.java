
public class QuickFindUF {
    private int[] id;    // id[i] = component identifier of i
    private int count;   // number of components

    public QuickFindUF(int n) {
        count = n;
        id = new int[n];
    }

    public int count() {
        return count;
    }

    public int find(int p) {
        validate(p);
        return id[p];
    }

    // validate that p is a valid index
    private void validate(int p) {
        int n = id.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1));
        }
    }

    @Deprecated
    public boolean connected(int p, int q) {
        validate(p);
        validate(q);
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        validate(p);
        validate(q);
        int pID = id[p];   // needed for correctness
        int qID = id[q];   // to reduce the number of array accesses

        // p and q are already in the same component
        if (pID == qID) return;

        for (int i = 0; i < id.length; i++)
            if (id[i] == pID) id[i] = qID;
        count--;
    }

}
