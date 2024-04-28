package Features;
import java.math.BigInteger;

class FibInt {
	private int dp[];

	FibInt(int N) {
		dp = new int[Math.max(2, N+1)];
		dp[1] = 1;
		for(int i=2;i<=N;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
	}

	int getValue(int N) {
		return this.dp[N];
	}
}

class FibLong {
	private long dp[];

	FibLong(int N) {
		dp = new long[Math.max(2, N+1)];
		dp[1] = 1;
		for(int i=2;i<=N;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
	}

	long getValue(int N) {
		return this.dp[N];
	}
}

class FibBigint {
	private BigInteger dp[];

	FibBigint(int N) {
		dp = new BigInteger[Math.max(2, N+1)];
		dp[0] = BigInteger.ZERO;
		dp[1] = BigInteger.ONE;
		for(int i=2;i<=N;i++) {
			dp[i] = dp[i-1].add(dp[i-2]);
		}
	}

	BigInteger getValue(int N) {
		return this.dp[N];
	}
}