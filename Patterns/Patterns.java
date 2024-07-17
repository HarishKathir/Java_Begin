public class Patterns {
    public static void square(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightAngleTriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void leftAngleTriangle(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=n-i-1;j>=0;j--){
                System.out.print(" ");
            }
            for(int k = 0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedPyramid(int n){
       for(int i=n;i>=0;i--){
           for(int j=n-i-1;j>=0;j--){
               System.out.print(" ");
           }
           for(int k=0;k<i;k++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }

    public static void diamond(int n){
        for(int i=0;i<n;i++){
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int k = 0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=n-i-1;j>=0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void squareHollowPattern(int n){
        for(int i=0;i<n;i++){
            if(i>0 && i<n-1){
                for(int j=0;j<n-1;j++){
                   if(j==0 || j==n-2){
                       System.out.print("* ");
                   }
                    System.out.print("  ");
                }
                System.out.println();
            }
            else{
                for(int j=0;j<n;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        square(5);
        rightAngleTriangle(5);
        leftAngleTriangle(5);
        pyramid(5);
        invertedPyramid(5);
        diamond(5);
        squareHollowPattern(5);
    }
}
