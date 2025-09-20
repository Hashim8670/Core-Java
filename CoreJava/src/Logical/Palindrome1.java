package Logical;

class Palindrome1
{
    public static void main(String[] args) {
        int a = 123;
        int b = a;
        int res = 0;
        while (a > 0)
        {
            int c = a % 10;
            res = res * 10 + c;
            a = a / 10;
        }
        if (res == b)
        {
            System.out.println(res + " is palindrome no");
        }
        else
        {
            System.out.println(res +" is Not A  Palindrome No");
         }

    }
}