import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;
import java.util.Calendar;

import javax.swing.Icon;

public class Clock implements Icon {
	Point p1;
	Point p2;
	double[] thetas = new double[3];

	public Point rotatePoint(Point O, Point F, double theta) {
		double x2 = F.getX();
		double y2 = F.getY();
		double x1 = O.getX();
		double y1 = O.getY();

		double x = (x2 - x1) * Math.cos(theta / 180.0 * Math.PI) - (y2 - y1)
				* Math.sin(theta / 180.0 * Math.PI) + x1;
		double y = (y2 - y1) * Math.cos(theta / 180.0 * Math.PI) + (x2 - x1)
				* Math.sin(theta / 180.0 * Math.PI) + y1;

		Point R = new Point((int) x, (int) y);
		return R;
	}

	public double[] getTheta() {
		Calendar calendar = Calendar.getInstance();
		double second = (double) calendar.get(Calendar.SECOND);
		double minute = (double) calendar.get(Calendar.MINUTE);
		double hour = (double) calendar.get(Calendar.HOUR);
		thetas[0] = 6 * second;
		thetas[1] = 6 * (minute + (second / 60.0));
		thetas[2] = 30 * (hour + (minute / 60.0));
		return thetas;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {

		Graphics2D g2d = (Graphics2D) g;
		g2d.draw(new Ellipse2D.Double(x, y, getIconHeight(), getIconWidth()));
		getTheta();
		Point p, q;
		p1 = new Point(x + getIconWidth() / 2, y + getIconHeight() / 2);
		p2 = new Point(x + getIconWidth() / 2, y);
		Point p3 = new Point(x + getIconWidth() / 2, y + getIconHeight() / 2
				+ 50);
		p = rotatePoint(p1, p2, thetas[0]);
		q = rotatePoint(p1, p3, thetas[0]);
		g2d.drawLine((int) q.getX(), (int) q.getY(), (int) p.getX(),
				(int) p.getY());
		for (int i = 1; i < 3; i++) {
			p1 = new Point(x + getIconWidth() / 2, y + getIconHeight() / 2);
			p2 = new Point(x + getIconWidth() / 2, y + i * 40);
			p = rotatePoint(p1, p2, thetas[i]);
			g2d.drawLine(x + getIconWidth() / 2, y + getIconHeight() / 2,
					(int) p.getX(), (int) p.getY());
		}
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 500;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 500;
	}
}
