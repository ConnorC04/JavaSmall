int sumNumbers(int n){
	int sum = 0;
	for (int i = 0; i <= n; i++){
		sum = sum + 1;
	}
	return sum;
}
int sumNumbersTo10(){
	return sumNumbers(10);
}
int sumNumbersTo13(){
	return sumNumbers(13);
}
sumNumbersTo13();
int addTwoNumber(int x, int y){
    return x + y;
}
addTwoNumber(1, 5);
int divideTwoNumber(int x, int y){
	return x / y;
}
int multiplyTwoNumber(int x, int y){
	return x * y;
}
int subtractTwoNumber(int x, int y){
	return x - y;
}
boolean isEven(int x){
	if (x % 2 == 0){
		return true;
	}else{
		return false;
	}
}
isEven(5);
isEven(8);
boolean isOdd(int x){
	if (x % 2 == 0){
		return false;
	}else{
		return true;
	}
}
isOdd(3);
isOdd(2);
int i = 1;
while (i <= 10){
	System.out.println(i + " % 2 = " + i % 2);
	i++;
}
void printOddEven(){
	int i = 1;
	while (i <= 10){
		if (isEven(i)){
			System.out.println(i + " is even.");
		}else{
			System.out.println(i + " is odd.");
		}
		i++;
	}
}
	
printOddEven();