import java.util.ArrayList;
import java.util.HashSet;


public class UF {
        private ArrayList<Integer> HeadWinnter;
        private int[] parent;  // parent[i] = parent of i
        private byte[] rank;   // rank[i] = rank of subtree rooted at i (never more than 31)
        private int size; // the size of the board
        public UF(int n) {
            size  = (int) Math.sqrt(n-1);
            if (n < 0) throw new IllegalArgumentException();
            HeadWinnter = new ArrayList<Integer>();
            parent = new int[n];
            rank = new byte[n];
            for (int i = 0; i < n; i++) {
                rank[i] = 0;
            }
        }
        public int[] getParent(){
            return parent;
        }
        public void setParent(int[] newPar){
            parent=newPar;
        }


        public int find(int p) {
            validate(p);
            while (p != parent[p]) {
                parent[p] = parent[parent[p]];    // path compression by halving
                p = parent[p];
                System.out.println("p "+p);
            }
            return p;
        }

        public void initialize( int pos){
            parent[pos]=pos;
        }

    public void printAllValue(){
        String str = " ";
        int count = 0 ;
        for (int i = 0 ; i< parent.length ;i++){
            str+= parent[i] +" ";
            if (i%size==0){
                str+="\n";
            }
        }
        System.out.println(str);
    }

        public boolean canPlay(int row, int col)  throws IllegalArgumentException {
            int position = 4*row+col +1 ;
            if (row < 0  || col < 0  || row >  size  || col > size ) {
                throw new IllegalArgumentException("Invalid row or col");
            }
            if (parent[position] == 0) {
                return true;
            }
            return false;
        }


    public int count(){
        HashSet<Integer> set = new HashSet<>();
        for (int num : parent) {
            if (num != 0 ) {
                set.add(find(num));
            }
        }
        return set.size();
    }

    public int getPosition(int i ){
        return parent[i];
    }
    public int getSize(){
        return size;
    }


    @Deprecated
        public boolean connected(int p, int q) {
            return find(p) == find(q);
        }

        public void unionForBlack(int p, int q) {
            if((p-1)%size == 0 ){
                HeadWinnter.add(p);
            } else if ( (q-1)%size ==0 ) {
                HeadWinnter.add(q);
            }
            int rootP = find(p);
            int rootQ = find(q);
            System.out.println("P "+rootP);
            System.out.println("Q "+rootQ);
            if (rootP == rootQ) return;
            if(rootP % size ==0 ){
                parent[rootQ] = rootP;
            }else if ( rootQ % size == 0){
                parent[rootP] = rootQ;
            }else {
                // make root of smaller rank point to root of larger rank
                if (rank[rootP] < rank[rootQ]) parent[rootP] = rootQ;
                else if (rank[rootP] > rank[rootQ]) parent[rootQ] = rootP;
                else {
                    parent[rootQ] = rootP;
                    rank[rootP]++;
                }
            }
        }

        public boolean CheckWinnerBlack(){
            for(Integer num : HeadWinnter)
            {
                if(find(num) % size ==0) return true;
            }
            return false;
        }

    public boolean CheckWinnerWhite(){
        for(Integer num : HeadWinnter)
        {
            if(find(num) >= parent.length - size ) return true;
        }
        return false;
    }

    public void unionForWhite(int p, int q) {
        if((p-1)<= size ){
            HeadWinnter.add(p);
        } else if ( (q-1)<= size ) {
            HeadWinnter.add(q);
        }
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) return;
        System.out.println("P "+rootP);
        System.out.println("Q "+rootQ);


        if(rootP >=parent.length  - size){
            parent[rootQ] = rootP;
        }else if ( rootQ >=parent.length  - size){
            parent[rootP] = rootQ;
        }else {
            // make root of smaller rank point to root of larger rank
            if (rank[rootP] < rank[rootQ]) parent[rootP] = rootQ;
            else if (rank[rootP] > rank[rootQ]) parent[rootQ] = rootP;
            else {
                parent[rootQ] = rootP;
                rank[rootP]++;
            }
        }
    }

        // validate that p is a valid index
        private void validate(int p) {
            int n = parent.length;
            if (p < 0 || p >= n) {
                throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1));
            }
        }


    }



