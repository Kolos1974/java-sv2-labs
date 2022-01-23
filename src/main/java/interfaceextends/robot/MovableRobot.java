package interfaceextends.robot;

import java.util.List;

public interface MovableRobot {

    public abstract void moveTo(Point position);

    public abstract void fastMoveTo(Point position);

    public abstract void rotate(int angle);

    public abstract List<Point> getPath();
}
