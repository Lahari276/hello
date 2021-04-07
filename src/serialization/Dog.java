package serialization;

import java.io.Serializable;

public class Dog implements Serializable {
	 transient final int i=10;
	 static int j =20;
}
