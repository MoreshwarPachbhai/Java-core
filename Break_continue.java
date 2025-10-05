public class Break_continue {
    public static void main(String[] args) {

        for(int i = 1; i <= 20; i++){
            if(i == 10){
                continue;
            } else if (i == 19) {
                break;
            }
            System.out.println(i);
        }
    }
}
