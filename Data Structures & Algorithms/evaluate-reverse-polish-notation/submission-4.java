class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st = new Stack<>();


        for(int i=0;i<tokens.length;i++){

            if(tokens[i].equals("+")|| tokens[i].equals("-")|| tokens[i].equals("*")||  tokens[i].equals("/")){

                int b = st.pop();
                int a = st.pop();
                int res=0;
                switch(tokens[i]){
                    case "+":
                        res=a+b;
                        break;
                    case "-":
                        res=a-b;
                        break;
                    case "/":
                        res=a/b;
                        break;
                    case "*":
                        res=a*b;
                        break;
                }
                st.push(res);

            } else{

                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}
