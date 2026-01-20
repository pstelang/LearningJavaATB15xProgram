package exe_19_2D_Array;

public class Declaration_2D {
    public static void main(String[] args) {
        int [][]aray={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int i=0;i<aray.length;i++)
        {
            for(int j=0;j<aray[i].length;j++)
            {
                System.out.print(aray[i][j]);
            }
            System.out.println("");
        }
    }
}
