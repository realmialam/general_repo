// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
         List<Integer> ans = new ArrayList<Integer>();
         ans = pattern(5);
    }
    
    public List<Integer> pattern(int N){
       List<Integer> ans = new ArrayList<Integer>();
       ans.add(N);
       if(N>0){
           ans = formPattern(N, N-5, ans);
       }else{
           ans = formPattern(N, N+5, ans);
       }
       return ans;
    }
    
    public List<Integer> formPattern(int N, int temp, List<Integer> ans){
        
        if(N==temp){
            return ans;
        }
        
        if(temp>0){
            ans.add(temp);
            temp = temp-5;
            ans = formPattern(N, temp, ans);
        }else{
            ans.add(temp);
            temp = temp + 5;
            ans = formPattern(N, temp, ans);
        }
        
        return ans;
        
    }
}