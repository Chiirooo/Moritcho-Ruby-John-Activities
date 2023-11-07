package pemdasFiles;
public class StackChar{
    private char[] stack;
    private int top;

    public StackChar(){
        stack = new char[20];
        top = 0;
    }

    public int getTop(){
        return top;
    }

    public void push(char x){
        top++;
        stack[top] = x;
    }

    public char pop(){
        if(top == 0){
            return 'x';
        }
        char x = stack[top--];
        // top--;
        return x;
    }
    
    public char peek(){
        if(stack[top] == 0){
            return 0;
        }
        return stack[top];
    }

    public void show(){
        if(top == 0) {
            System.out.println("Stack is empty");
            return;
        }

        for(int i = 1; i <= top; i++){
            System.out.print(stack[i] + " ");
        }
    }
}