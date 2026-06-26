package person;

import java.util.Stack;

public class Generator {
	public static void main(String args[]) {
		String code = "Person CLS name.length()>2 ATT surname String true ATT";
		code += "mail String name+\".\"+surname+\"@uha.fr\" DER";
		String[] words = code.split(" ");
		Stack<String> stack = new Stack<String>();
		for (String word : words)
			if (word.equals("CLS")) {
				String name = stack.pop();
				String cod = "public class "+name+ "{\n";
				stack.push(cod);
				
			} else if(word.equals("ATT")) {
				String cnd = stack.pop();
				String type = stack.pop();
				String name = stack.pop();
				String nam = name.substring(0,1).toUpperCase() + name.substring(1);
				String cls = stack.pop();
				String cod = cls + "\tprivate "+type+" "+name+";\n";
				cod += "\tpublic "+type+" get"+nam+"() {\n";
				cod += "\t\treturn this."+name+";\n";
				cod += "\t}\n";
				cod += "\tpublic void set"+nam+"("+type+" "+name+") {\n";
				cod += "\t\tthis."+name+" = "+name+";\n";
				cod += "\t\tif ("+cnd+")\n";
				cod += "\t}\n";
				stack.push(cod);
				
			} else if(word.equals("DER")) {
				String exp = stack.pop();
				String type = stack.pop();
				String name = stack.pop();
				String nam = name.substring(0,1).toUpperCase() + name.substring(1);
				String cls = stack.pop();
				String cod = cls;
				cod += "\tpublic "+type+" get"+nam +"() {\n";
				cod += "\t\treturn "+exp+";\n";
				cod += "\t}\n";
				stack.push(cod);
				
			} else
				stack.push(word);
			
			System.out.println(stack.pop()+"}");
	}
}
