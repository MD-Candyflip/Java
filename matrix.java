
public class matrix {
    public static void main(String[] args) {
        int x[][]={{1,2,3},{3,4,5},{6,7,8}};
        int y[][]={{1,2,3},{3,4,5},{6,7,8}};
        int z[][]=new int[3][3];
        for(int a=0; a<3; a++){
            for(int b=0; b<3; b++){
                z[a][b]=0;
                for(int c=0; c<3; c++){
                    z[a][b]=z[a][b]+x[a][c]*y[c][b];
                }
                System.out.print(z[a][b]+" ");
            }
            System.out.println("");
        }
      
    }
}
