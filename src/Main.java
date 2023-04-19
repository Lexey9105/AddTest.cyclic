public class Main {
    public static void main(String[] args) {
        tack4();
        tack5();
    }
    public static void tack4(){
        int x=0;
        for(int i=1;i<=30;i++){x++;if(x%3==0&&x%5!=0){System.out.println(i+" ping");}
        else if (x%5==0&&x%3!=0){System.out.println(i+" pong");}
        else  if (x%5==0&&x%3==0){System.out.println(i+" ping pong");}
        else {
            System.out.println(i+" ");
        }
        }
        System.out.println();
    }
    public static void tack5() {
        int a = 21;
        int b = 34;
        System.out.print(" " + a + " ");
        System.out.print(" " + b + " ");
        for (int i = 0; i < 4; i++) {
            a += b;
            b += a;
            System.out.print(" " + a + " ");
            System.out.print(" " + b + " ");
        }
    }
}