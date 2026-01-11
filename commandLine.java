public class commandLine {
    public static void main(String[] args) {
        if(args.length > 0){
            System.out.println("argument given is: ");
            for(String i: args){
                System.out.println(i + " ");
            }
        }
        else{
            System.out.println("No argument given !!");
        }
    }
}
