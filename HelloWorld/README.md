## Anatomy of a Java Program
**Function**

- A block of code that performs a task
```
ReturnType Name{
	...
}
```
```
void Name{
	...
}
```
```
void sendEmail{
	...
}
```
```
void main{
	...
}
```

- A container for related functions
```
class Main{
	void main{
		...
	}
}
```
- PascalNamingCovention - Classes

- camelCasingCovention - Methods
```
public class Main{
	public void main{
		...
	}
}
```
___

**Java Code Executed**
```
Source Code  -->  Java Compiler  -->  Byte Code
(.java)           (.class)
```

Java Runtime Environment (JRE)
```
Byte Code  -->  Java Virtual Machine  -->  Native Code
(.class)	
