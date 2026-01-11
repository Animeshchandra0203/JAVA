class Main {
    public static void main(String[] args) {

        if(args.length != 3){
            System.out.println("Usage: java Main <num1> <op> <num2>");
            return;
        }

        float a = Float.parseFloat(args[0]);
        char op = args[1].charAt(0);
        float b = Float.parseFloat(args[2]);

        switch(op){
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/': 
                if(b == 0)
                    System.out.println("Cannot divide by zero");
                else
                    System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
