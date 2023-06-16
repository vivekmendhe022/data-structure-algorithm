package Simple;

public class QuadEqu {
	/*
	 * Algorithm 3: Find Roots of a Quadratic Equation ax2 + bx + c = 0
		Step 1: Start
		Step 2: Declare variables a, b, c, D, x1, x2, rp and ip;
		Step 3: Calculate discriminant
		         D ← b2-4ac
		Step 4: If D ≥ 0
		              r1 ← (-b+√D)/2a
		              r2 ← (-b-√D)/2a 
		              Display r1 and r2 as roots.
		        Else     
		              Calculate real part and imaginary part
		              rp ← -b/2a
		              ip ← √(-D)/2a
		              Display rp+j(ip) and rp-j(ip) as roots
		Step 5: Stop 
	 */	
	public static void main(String[] args) {
		int a=5, b=5, c=5, D, x1, x2, rp, ip;
		int r1, r2;
		D=(b*2)-(4*a*c);
		
		if (D>=0) {
			r1=(int) ((-b+Math.sqrt(D))/2*a);
			r2=(int) (Math.sqrt(-D)/2*a);
			System.out.println(r1);
			System.out.println(r2);
		}
		else {
			rp=-b/(2*a);
			ip=(int) (Math.sqrt(-D)/2*a);
			System.out.println(rp+"+j"+ip);
			System.out.println(rp+"-j"+ip);
		}
	}

}
