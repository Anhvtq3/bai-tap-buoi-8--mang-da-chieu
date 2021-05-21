import java.util.Scanner;

public class Main {
    public static void main(String args[]){
     Bai1();
    }
    static void Bai1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của hàng: ");
        int row=scanner.nextInt();
        System.out.print("Nhập số phần tử của cột: ");
        int cloum=scanner.nextInt();

        int [][] A= new int[row][cloum];
        for(int i=0;i<row;i++){
            for (int j=0; j<cloum;j++){
                System.out.printf("Nhập số phần tử mảng A ở ví trí  A[%d][%d]:", i, j);
                A[i][j]= scanner.nextInt();

            }
        }
        show(A);
        int sum=0;
        //Liệt kê các phần tử nằm trên đường chéo chính
        System.out.println("Hiển thị các phần tử ở đường chéo chính: ");


        for (int i=0;i<row;i++){
            for (int j=0;j<cloum;j++){
                if(i==j){
                    System.out.println(A[i][j]+"\t");
                    sum+=A[i][j];
                }
            }

        }
        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);

        //Sắp xếp hàng 2 trong mảng theo chiều tăng dần
        System.out.println("Sắp xếp hàng thức 2 trong mảng theo chiều tăng dần:");
        for (int k=0;k<row;k++){
            for (int i=0;i<cloum;i++){
                for(int j=1;j<cloum;j++){
                    if ((k==2)&&(A[k][i]>A[k][j])){
                        int temp=A[k][i];
                        A[k][i]=A[k][j];
                        A[k][j]=temp;
                        System.out.println(A[k][j] +"\t");
                    }
                }
            }
        }



    }
    static void show(int[][] matran){
        System.out.println("Hiển thị ma trận vừa nhập: ");

        for(int i=0;i<matran.length;i++){
            for (int j=0; j<matran[i].length;j++){
                System.out.print(matran[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
