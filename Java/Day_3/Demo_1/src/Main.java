public class Main{
    public static void main(String args[]) {
        DrawLine line = new DrawLine();
        DrawCircle circle = new DrawCircle();
        DrawRectangle rectangle = new DrawRectangle();
        doDrawing(line);
        doDrawing(circle);
        doDrawing(rectangle);
    }

    public static void doDrawing(Draw x){
        x.letsDraw();
    }
}