package chap1.nonaccessmodifiers.staticmembers;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

// cet exp permet de tester est-ce que la variable static sVar héritée sera commune aussi aux  
// objets de la classe derivee ? ou bien seulement aux objets de la classe de base dorigine ?
// la reponse c est qu elle sera commune aux objets de la classe de base dorigine et aux objets de la classe derivee 
public class SubMyClass extends MyClass {
	static void incrementSVarSub() {
		sVar++;
	}

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.sVar++;
		System.out.println("myClass.sVar " + myClass.sVar);//1
		SubMyClass subMyClass = new SubMyClass();
		subMyClass.sVar++;
		System.out.println("myClass.sVar " + myClass.sVar);//2
		System.out.println("subMyClass.sVar " + subMyClass.sVar);// 2
		myClass.incrementSVar();
		subMyClass.incrementSVarSub();
		System.out.println("myClass.sVar " + myClass.sVar); // 4
		System.out.println("subMyClass.sVar " + subMyClass.sVar);// 4
	}
}
