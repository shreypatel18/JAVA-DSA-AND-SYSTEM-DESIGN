public class Main {
    public static void main(String[] args) {

        Letters l1 = new Letters();

        l1.patternOfA();
        l1.patternOfB();
        l1.patternOfG();

        Triangle t1 = new Triangle();
        t1.printTriangle();

        house h1 = new house();
        h1.printHouse();

    }
}
class Letters {
    int n = 11;void patternOfA() {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( i+j==(n-1)/2||j-i == (n-1)/2||i==(n-1)/4+1&&j>=(n-1)/4&&j<=(n-1)*3/4) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

    void patternOfB(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j==0||i==0&&j<(n-1)/2||i==(n-1)&&j<(n-1)/2||i==(n-1)/2&&j<(n-1)/2||j==((n-1)/2)&&i>0&&i<(n-1)&&i!=(n-1)/2
              ) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

    void patternOfG(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0&&j<(n-1)&&j>(0)|| i==(n-1)&&j<(n-1)&&j>(0)||j==0&&i<n-1&&i>0||j==(n-1)&&i>(n-1)/2&&i<(n-1)||
                i==(n-1)/2&&j<(n-1)&&j>(n-1)/2||j==(n-1)&&i>0&&i<(n-1)/4) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

class Triangle{
    int n= 11;
    void printTriangle(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( i==(n-1)/2|| i+j>=(n-1)/2 && j-i <= (n-1)/2&& i<(n-1)/2) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
class house{
    int n =11;
    void printHouse(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i+j<=(n-1)/2&&i<=(n-1)/2|| j-i>=(n-1)/2&&i<=(n-1)||i>(n-1)/2&&j==0||i>(n-1)/2&&j==(n-1)
            || i==(n-1)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

