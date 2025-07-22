import java.util.*;

public class Main {
    static long p,q;
    static Map<Long, Long> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        p = sc.nextLong();
        q = sc.nextLong();

        System.out.println(check(n));

    }

    public static long check(Long n){
        if(n == 0) return 1;
        if (map.containsKey(n)) return map.get(n);

        long tmp = check(n / p) + check(n/q);
        map.put(n,tmp);
        return tmp;
    }
}
