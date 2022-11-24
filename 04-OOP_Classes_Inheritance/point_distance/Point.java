package point_distance;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double distance = Math.sqrt(this.x * this.x + this.y * this.y);
        return distance;
    }

    public double distance(int x, int y) {
        double distance = Math.sqrt(x * x + y * y);
        return distance;
    }

    public double distance(Point xy) {

        return Math.sqrt((getX() - xy.getX()) * (getX() - xy.getX()) + (getY() - xy.getY()) * (getY() - xy.getY()));
    }

}
