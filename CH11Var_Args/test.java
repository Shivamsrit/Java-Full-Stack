package CH11Var_Args;

public class test {
    // internally int... x => int []a
    public int print(int... x) {
        int total=0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }
        return total;
    }
}
