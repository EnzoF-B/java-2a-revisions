package table;

import java.util.ArrayList;
import java.util.function.Function;

public class Set<T> extends ArrayList<T>{
	public String toString() {
		String result = "";
		for (T x : this)
			result += x + "\n";
		return result;
	}
	// QUERY
	public Set<T> select(Function<T,Boolean> criterion) {
		Set<T> result = new Set<T>();
		for (T x : this)
			if(criterion.apply(x))
				result.add(x);
		return result;
	}
	
	public Set collect(Function<T,T2> projection) {
		Set result = new Set<T>();
		for (T x : this)
			result.add(projection.apply(x));
		return result;
	}
}
