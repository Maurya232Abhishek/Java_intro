
package innerclasses;


public class OuterClass {
    //InnerClass ic =new InnerClass();
     
    private class InnerClass
            {
        public int hell;
        
            //InnerClass ic= new InnerClass();
            //OuterClass oc=new OuterClass();
            }
    public static void main(String[] args)
    {
        OuterClass oc= new OuterClass();
        oc.new InnerClass();
        OuterClass.InnerClass ic = new OuterClass().new InnerClass();
        ic.hell=1902;
        System.out.println(ic.hell);
    }
}
