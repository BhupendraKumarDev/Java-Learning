public class holloRecatangle {

    public static void hollow_rectangle(int toRows, int toColos){
        for(int i=1; i<=toRows; i++){
            for(int j=1; j<=toColos; j++){
                if(i==1 || i==toRows || j==1 || j== toColos){
                    System.out.print(" * ");
                } else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
       hollow_rectangle(5, 5);
    }
}
