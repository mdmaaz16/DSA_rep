class reversearray
{
    public static void main(String[] ar)
    {
        int a[]={1,2,5,6,7};
        int i=0;
        int j = a.length-1;
        while(i<j)
        {
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        //  System.out.println(i);
        // System.out.println(j);
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }
}