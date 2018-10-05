package HomeWork4;

public class Cyrcle {
        int radius;
        static final double Pi = 3.1415926536;
        Cyrcle (int r) {
            radius = r;


        }
        public static int getPerim(int r){
            int CyrclePerim = (int) (2 * Pi * r);
            return  CyrclePerim;

        }
        public static int getSq(int r){
            int CyrcleSq = (int) (Pi * Math.pow(r,2));
            return CyrcleSq;

    }
}
