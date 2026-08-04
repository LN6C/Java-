public class Rectangle {
    private int length;
    private int width;

    public void setLength(int len){
        if (len<0) {
            System.out.println("边长必须大于0");
        }else{
            length = len;
        }
    }
    public int getLength(){
        return length;
    }

    public void setWidth(int wid){
        width = wid;
    }
    public int getWidth(){
        return width;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return (length+width)*2;
    }
}
