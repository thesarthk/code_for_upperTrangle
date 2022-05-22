package Examples;

public class HalfPiramid {
    public static void main(String[] Args){
        int Rnum=5;
        int i;
        for(i=1;i<=Rnum;i++){
            for(int j = 1; j<=(2*Rnum-2*i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            for (int h=i-1;h>=1;h--){
                System.out.print(h+" ");
            }
            System.out.println("");
    }}
}
