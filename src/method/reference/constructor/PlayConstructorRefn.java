package method.reference.constructor;

public class PlayConstructorRefn {
	public static void main(String[] args) {
		ISample i = ISampleClass::new;
		ISampleClass s1 = i.get("lahari");
	}
}
