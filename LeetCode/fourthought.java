import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class fourthought {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); // Read value from user
        for(int i = 0 ; i< a ; i++){
            int b = scan.nextInt();
            if(-60<=b && b<=256){
            System.out.println(dataBase(b));
            }
            else {
                System.out.println("no solution");
            }
        }
    }
    public static String dataBase( int key){
        HashMap<Integer, String > dataBase = new  HashMap<Integer,String>();
        Character[] expression  = { '*','/','+', '-'};
        for (char i  : expression){
            int result = 4 ;
            String exprString = "4 " + i ;
            String current = exprString;
            for (char j  : expression){
                 exprString = current + " 4 " +  j ;
                for (char k  : expression){
                    if(!dataBase.containsKey(expressionProcess(exprString + " 4 " + k + " 4 "))) {

                        dataBase.put(expressionProcess(exprString + " 4 " + k + " 4 "), exprString + " 4 " + k + " 4 " + " =" + expressionProcess(exprString + " 4 " + k + " 4 "));
                    }
                }

            }

        }

        return dataBase.getOrDefault(key, "no solution");
    }





    public  static int expressionProcess(String expression){
        int result = 4 ;
        Stack<Character> oporatorStack = new Stack<Character>();
        Stack<Integer> numberStack = new Stack<Integer>();

        for (int i = 0; i < expression.length(); i++) {
            if(isOperator(expression.charAt(i))){
                oporatorStack = stackOrganize(expression.charAt(i), oporatorStack);
            } else if (Character.isDigit(expression.charAt(i))) {
                numberStack.push(Integer.parseInt(String.valueOf(expression.charAt(i))));
            }
        }

        while (!oporatorStack.isEmpty()){
            System.out.println(oporatorStack);
            System.out.println(numberStack);

            Character currentOperator = oporatorStack.peek();
            oporatorStack.pop();
            numberStack = processoperator(currentOperator,numberStack);

        }

        return numberStack.peek();
    }

    public static Stack<Character>  stackOrganize(Character current , Stack<Character> oporatorStack){

        if(!oporatorStack.isEmpty()){
            Character previousItem = oporatorStack.peek();
            if(operatorPrecedence(previousItem) > operatorPrecedence(current) ){
                oporatorStack.pop();
                oporatorStack.push(current);
                oporatorStack.push(previousItem);
            } else {
                oporatorStack.push(current);
            }
        }else{
            oporatorStack.push(current);
        }
        return oporatorStack;


    }

    private static Stack<Integer> processoperator(Character operator, Stack<Integer> numberStack){
        int secondnumber = numberStack.peek();
        numberStack.pop();
        int firstnumber = numberStack.peek();
        numberStack.pop();

        if(operator == '+'){
            numberStack.push(firstnumber+secondnumber) ;
        } else if (operator == '-') {
            numberStack.push(firstnumber-secondnumber) ;
        } else if (operator == '*') {
            numberStack.push(firstnumber*secondnumber) ;
        }else {
          if(secondnumber == 0 ){numberStack.push(0) ;}
               else{ numberStack.push(firstnumber/secondnumber) ;}

        }
        return  numberStack;

    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }


    private static int operatorPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }
}
