package example.Demo;

public class UnionFind {
    //存放父节点
    private int[] parent;
    //记录数的"重量"
    private int[] size;
    //记录连通个数
    private int count;

    public UnionFind(int n){
        count = n;
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++){
            parent[i] = i;
            size[i] = 1;
        }
    }
    public void union(int p, int q){
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ)
            return;

        //小树接到大树下边
        if (size[rootP] > size[rootQ]){
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }else{
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
        count--;
    }
    public int find(int x){
        while(parent[x] != x){
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }
    public boolean connected(int p, int q){
        int rootQ = find(q);
        int rootP = find(p);
        return rootP == rootQ;
    }
    public int getCount(){
        return count;
    }
}
