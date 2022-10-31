public class MainMehodOverloading {
    public String main(String a) {
        return "";
    }
    public static void main(String ... args) {
        Ok o = new Ok();
        System.out.println(o.sum(2,3));
        System.out.println(o.sum(1,2,3));
    }
}

class Ok{
    int sum(int ...a){
        int sum = 0;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }
    int sum(int x, int y){
        System.out.println("Non VarArgs called");
        return x+y;
    }

}
