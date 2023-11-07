package pemdasFiles;
public class Pemdas {
    private PostFix post;
    private StackInt stack;

    public Pemdas(){
        post = new PostFix();
        stack = new StackInt();
    }

    public int solve(String s){
        return Calculate(post.converToPostFix(s));
    }

    public int Calculate(String s){
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            switch(x){
                case '_': 
                    stack.setHasNum(false);
                    break;
                case '+':
                    sum();
                    stack.setHasNum(false);
                    break;
                case '-':
                    diff();
                    stack.setHasNum(false);
                    break;
                case '/':
                    quo();
                    stack.setHasNum(false);
                    break;
                case '*':
                    prod();
                    stack.setHasNum(false);
                    break;
                case '^':
                    pow();
                    stack.setHasNum(false);
                    break;
                case '%':
                    mod();
                    stack.setHasNum(false);
                    break;
                case 'u':
                    unaryMinus();
                    stack.setHasNum(false);
                    break;
                default:
                    if(stack.HasNum() == true){
                        // System.out.println(n);
                        stack.push(stack.pop() * 10 + Integer.parseInt(String.valueOf(x)) );
                    }
                    else{
                        stack.push( Integer.parseInt(String.valueOf(x)) );
                        stack.setHasNum(true);
                    }
            }            
        }
        return stack.peek();
    }

    private void mod(){
        int a, b, result;
        a = stack.pop();
        b = stack.pop();
        result = b % a;
        System.out.println("    " + b + " % " + a + " = " + result);
        stack.push(result);
    }

    private void unaryMinus(){
        int a, result;
        a = stack.pop();
        result = a * (-1);
        System.out.println("(-) " + a + " = " + result);
        stack.push(result);
    }

    private void sum(){
        int a, b, result;
        a = stack.pop();
        b = stack.pop();
        result = b + a;
        System.out.println("    " + b + " + " + a + " = " + result);
        stack.push(result);   
    }
    private void diff(){
        int a, b, result;
        a = stack.pop();
        b = stack.pop();
        result = b - a;
        System.out.println("    " + b + " - " + a + " = " + result);
        stack.push(result);  
    }
    private void quo(){
        int a, b, result;
        a = stack.pop();
        b = stack.pop();
        result = b / a;
        System.out.println("    " + b + " / " + a + " = " + result);
        stack.push(result);
    }
    private void prod(){
        int a, b, result;
        a = stack.pop();
        b = stack.pop();
        result = b * a;
        System.out.println("    " + b + " * " + a + " = " + result);
        stack.push(result); 
    }

    private void pow(){
        int a, b, result;
        a = stack.pop();
        b = stack.pop();
        result = b;
        for(int i = 1; i < a; i++){
            result *= b;
        }
        System.out.println("    " + b + " ^ " + a + " = " + result);
        stack.push(result);
    }
}