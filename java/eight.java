public class variables{
    int a = 1;
    static int b = 2;
    public static void main(String a[]){
        variables obj = new variables();
        int c = 3;
        System.out.println("Vaibhav Upreti");
        System.out.println("Local variable: " + c);
        System.out.println("Instance variable: " + a);
        System.out.println("Instance variable: " + obj.a);
        System.out.println("Static variable: " + b);
    }
}
