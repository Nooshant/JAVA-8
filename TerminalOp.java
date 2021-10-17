package terminal.operation;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

@FunctionalInterface
interface FunctInt
{
	public void method(String str);
	
	default void name() {
		System.out.println("Default method..");
	}
}



public class TerminalOp  {
	
	public static void main(String[] args) {
		
		String[] array = { "Geeks", "for", "Geeks" };
		  
        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> String_combine = Arrays.stream(array).reduce((str1, str2)-> str1 + "-" + str2);
        System.out.println(String_combine.get());
        System.out.println(Arrays.stream(array).distinct().findAny().get());
        
        String string = "functional interface";
        FunctInt fInt = (String str)->{ System.out.println(string+ " implementation");};
        fInt.method(string);
        fInt.name();
        
        
        
        Consumer<Integer> display = a -> a=a*2;
        
        Consumer<Integer> diConsumer = a -> System.out.println(a);
        display.andThen(diConsumer).accept(15);
        
	}
}
