/**
 * Created by dbobkova on 31.10.2016.
 */
public class FigurePlotter {
    public static void figurePlotterPerform() {
        //rectangleDraw(5,4);
        //trianglegleDrawA(8);
        trianglegleDrawB(8);
        //trianglegleDrawC(8);
        trianglegleDrawD(8);
        //rectangleDrawE(8,8);
        //drawF(8,8);
        //drawG(8,8);
        //drawH(8,8);
        drawI(8,8);


    }
    public static void rectangleDraw(int N, int M){
        for(int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {

                    System.out.print("# ");

            }
            System.out.println();
        }
    }

    public static void trianglegleDrawA(int N){
        for(int i = 0; i < N; i++)
        {
            for (int j = 0; j < i+1; j++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void trianglegleDrawB(int N){
        for(int i = 0; i < N; i++)
        {
            for (int j = 0; j < N -i; j++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void trianglegleDrawC(int N){
        for(int i = 0; i < N; i++)
        {
            for (int j = 0; j < N ; j++)//
            {
                //System.out.print(i + " " + j);
                if(j <i )
                {
                    System.out.print("\b\b");
                }
                else {
                    System.out.print("#\b");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void trianglegleDrawD(int N){
        for(int i = 0; i < N; i++)
        {
            for (int j = 0; j < N ; j++)//
            {
                //System.out.print(i + " " + j);
                if(j < N-i-1){
                    System.out.print("\b\b");
                }
                else {
                    System.out.print("#\b");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void rectangleDrawE(int N, int M){
        for(int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                if(i==0||i==N-1||j==0||j==M-1) {

                    System.out.print("#\b");
                }
                else{
                    System.out.print("\b ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawF(int N, int M){
        for(int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                if(i==0||i==N-1||j==i) {

                    System.out.print("#\b");
                }
                else{
                    System.out.print("\b ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void drawG(int N, int M){
        for(int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                if(i==0||i==N-1||j==N-i-1) {

                    System.out.print("#\b");
                }
                else{
                    System.out.print("\b ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void drawH(int N, int M){
        for(int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                if(i==0||i==N-1||j==N-i-1||j==i) {

                    System.out.print("#\b");
                }
                else{
                    System.out.print("\b ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void drawI(int N, int M){
        for(int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                if(i==0||i==N-1||j==N-i-1||j==i ||j==0 ||j==M-1) {

                    System.out.print("#\b");
                }
                else{
                    System.out.print("\b ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
