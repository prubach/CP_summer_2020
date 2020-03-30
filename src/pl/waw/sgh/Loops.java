package pl.waw.sgh;

public class Loops {

    public static void main(String[] args) {
        for (int i=0;i<6;i++) {
            if (i==2) continue;
            System.out.println("i=" + i);
            if (i==3) break;
        }

//        for (int j=10;j>2;j--) {
//            System.out.println("j=" + j);
//        }


    }
}
