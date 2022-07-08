class Beans
{
  String name;
  String color;
  String size;
  String shape;
  Beans(String name, String color,String size,String shape)
  {
    this.name=name;
    this.color=color;
    this.size=size;
    this.shape=shape;
  }
  public boolean equals (Object o)
  {
    if(!(o instanceof Beans))
       return false;
    if(this.name !=((Beans)o).name)
       return false;
    if(this.color!=((Beans)o).color)
       return false;
    return true;
  }
}
public class Beans_Main
{
  public static void main(String[] args)
  {
    Beans b1=new Beans("rajma","brown","long","oval");
    Beans b2=new Beans("rajma","brown","long","oval");
    
    System.out.println(b1.equals(b2));
  }
}intln(b1.equals(b2));
  }
}