package Fatorial_Fibonacci;



public class FatFibo {

	int fatorial(int num){

		if (num < 0){

			return -1;

		} else if (num == 0){

			return 1;

		} else {

			return num * fatorial(num - 1);

		}

	}

	

	int fibonacci(int num){

		if (num < 1){

			return -1;

		} else if (num == 1){

			return 0;

		} else if (num == 2){

			return 1;

		} else {

			int n1 = 0;

			int n2 = 1;

			int n3 = 1;

			num = num - 2;

			while (num > 0){

				n3 = n1 + n2;

				n1 = n2;

				n2 = n3;

				num--;

			}

			return n3;

		}

	}

}
