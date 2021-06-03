public class UserMainCode {
		static int getDigitSum(int N){
			int sum=0;
			while(sum>9||N>0){
				if(N==0){
					N=sum;
					sum=0;
				}
				sum+=N%10;
				N/=10;
			}
			return sum;
		}
}
