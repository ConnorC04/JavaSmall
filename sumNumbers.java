sumNumbers(5);
sumNumbers(10);
sumNumbers(106839);
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