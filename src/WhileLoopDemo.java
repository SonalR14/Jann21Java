public class WhileLoopDemo {
    public static void main(String[] args) {
        int i=0;
        int counter=1;
        while(i<=4){
            for(int j=1;j<=i;j++){
                System.out.println(" "+counter++);
            }
                System.out.println();
                i++;
        }
    }
}
