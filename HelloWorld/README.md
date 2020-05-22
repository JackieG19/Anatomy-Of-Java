## Anatomy of a Java Program
**Function**

- A block of code that performs a task
```
ReturnType Name{
	...
}

void Name{
	...
}

void sendEmail{
	...
}

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
**Variable Types**

- Primitive Type - for storing simple values

Type | Bytes | Range
---- | ----  | ----
byte | 1 | [-128, 127]
short| 2 | [-32k, 32k]
int  | 4 | [-2B, 2B]
long | 8 | 
float| 4 | 
double| 8 | 
char | 2 | A, B, C
boolean| 1 | true / false

- Reference Type - for storing complex object like date and mail message
