package exceptionHandling;

public class InvalidEntryException extends RuntimeException{
		InvalidEntryException(String msg){
			super(msg);
		}
}
