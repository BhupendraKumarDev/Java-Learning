public class functionOverloadingUsingDataType {
    public static void main(String[] args){
        System.out.println(sum(2, 9));
        System.out.println(sum(3.2f , 4.8f));
    }

    //func to cal int sum
    public static int sum(int a, int b){
        return a+b;
    }

    //func to cal float sum
    public static float sum(float a, float b){
        return a+b;
    }
}
