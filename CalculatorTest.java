// name: oscar dumeng
// week: 3
// lab: 2
// course: cmp 129
// date: 9/29/2026
public class CalculatorTest {
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();

        System.out.println("sum of 2 integers: " + calc.add (7,8));

        System.out.println("sum of 2 doubles: " + calc.add(5.5, 2.55));

        System.out.println("sum of 3 integers: " + calc.add(5,7, 8));

        System.out.println("concentrated strings: " + calc.add("hello " , "world"));
    }
    
}
