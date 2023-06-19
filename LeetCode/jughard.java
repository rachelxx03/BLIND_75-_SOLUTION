public class jughard {



    static int gcd(int a, int b)
    {
        // if b=0, a is the GCD
        if (b == 0)
            return a;

            // call the gcd() method recursively by
            // replacing a with b and b with
            // difference(a,b) as long as b != 0
        else
            return gcd(b, Math.abs(a - b));
    }

}
