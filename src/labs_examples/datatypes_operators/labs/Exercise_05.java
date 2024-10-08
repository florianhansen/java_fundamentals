package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = false;
        boolean b = true;
        if (a | b){
            System.out.println("a or b is true");
        }

        if (a & b){
            System.out.println("a and b is true");
        }

        if (!a){
            System.out.println("a is not true");
        }

        if (a ^ b){
            System.out.println("a or b is true but not both");
        }

        if (a && b){
            System.out.println("a and b is true");
        }
        if (a || b){
            System.out.println("a or b is true");
        }
    }

}

