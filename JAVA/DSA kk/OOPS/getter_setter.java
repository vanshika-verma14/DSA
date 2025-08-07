 class cylinder  {  //getter_setter
    private int radius;
    private int height;
    // public cylinder (int radius, int height) {
    //     this.radius = radius;
    //     this.height = height;
    // }
    public int getRadius()
{
    return radius;
}
public void setRadius(int radius)
{
    this.radius = radius;
} public int getHeight() {
    return height;
}

public void setHeight(int height) {
    this.height = height;
}
}
public class getter_setter{
    public static void main(String[] args) {
        cylinder obj = new cylinder();
         obj.setRadius(80);
        System.out.println(obj.getRadius());
    }
}
