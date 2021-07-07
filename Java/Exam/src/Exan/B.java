package Exan;

class B extends A
{
    public void doSomething()
    {
        super.doSomething();
        System.out.println("Extended in B");
    }

    public void doSomethingElse()
    {
        System.out.println("Else in B");
    }

    private void doIntern()
    {
        System.out.println("B intern");
    }
}
