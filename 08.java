class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        double slope =(double) (coordinates[0][1] - coordinates[1][1]) / (double)(coordinates[0][0]-coordinates[1][0]);
        //System.out.println(slope);
        for(int i=1;i<coordinates.length-1;i++){
            double a = (double)(coordinates[i][1] - coordinates[i+1][1]) / (double) (coordinates[i][0]-coordinates[i+1][0]);
            //System.out.println(a);
            if(a!=slope)
                return false;
        }
        return true;
    }
    //public boolean slope(int[] p1, int[] p2, int[] p3){
      //      int x1=p1[0], y1=p1[1], x2=p2[0], y2=p2[1], x3=p3[0], y3=p3[1];
       //     return ((y3-y2) * (x2-x1)) == ((y2-y1) * (x3-x2));
        //}
}