/**
 * boolean is a primitive type and it is very frequently appear in a program
 * boolean only include 2 values: true/false
 * B
 */
public class _001_boolean {
 
    public static void main(String[] args) {
        
        int age = 12;

        // A variable boolean and code set/get value from it
        boolean sex = false;
        System.out.println("Default value: " + sex);
        if ( sex ){
            System.out.println("It is female");
        } else {
            System.out.println("It is male");
        }

        // Operation with boolean type "age >= 12"
        if ( age >= 12 ){
            System.out.println("I am a child");
        } else {
            System.out.println("I am a baby");
        }

        sex = sex || true;
        System.out.println("Value of sex: " + sex);

        //sex ++ ; => compiler error
        //System.out.println("Value of sex: " + sex.toString()); => compiler error

        sex = Boolean.getBoolean("true_value");
        System.out.println("Convert to boolean with class Boolean: " + sex);

        /*
        compiler error: bad operand types for binary operator '>'
        if (true > false)
            System.out.println("compare values: true > false");
        */
    }
}