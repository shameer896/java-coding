class Solution{
    static String findLargest(int N, int S){
        // code here
        StringBuffer buff = new StringBuffer("");
        if( S>N*9 || (N > 1 && S == 0) ){
            buff.append("-1");
            return buff.toString();
        }
        
        int sum = 0;
        while(N > 0){
            if( S >= 9){
                buff.append("9");
                S -= 9;
            }else if(S >= 1 && S < 9){
                buff.append(S);
                S = 0;
            }else{
                buff.append("0");
            }
            --N;
        }
        
        return buff.toString();
    }
}
