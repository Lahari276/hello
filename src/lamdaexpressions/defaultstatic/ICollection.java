package lamdaexpressions.defaultstatic;

public interface ICollection {
	void add();
	void remove();
	default void append() {
		System.out.println("default method appending");
	}
	default void removeAll() {
		System.out.println("default removeall method");
	}
}
