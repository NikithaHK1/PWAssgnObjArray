class Print{

    void printArray(int a[][]){
        
        for(int i[] : a ){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
public class Assgn5 {
    public static void main(String[] args) {
        Print obj = new Print();
        obj.printArray(new int[][]{{1,2,3},{3,4},{7,8,9,8}});
    }
}
