package com.sX.utils;

import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.RoundRectangle2D;

public class ShapeUtils {

	public static double DEGREE_TO_RADIAN = 0.0174532925d;

	public static Shape getTriangle(int w, int h) {
		GeneralPath triangle = new GeneralPath();
		triangle.moveTo(0, 0);
		triangle.lineTo(w / 2, h / 2);
		triangle.lineTo(0, h);
		triangle.closePath();
		return triangle;
	}

	public static Shape getTabShape(int x, int y, int w, int h, double arc) {
		return getTabShape(x, y, w, h, arc, arc, arc, arc);
	}

	public static Shape getTabShape(int x, int y, int w, int h,
			double arcLeftX, double arcLeftY, double arcRightX, double arcRightY) {
		GeneralPath tab = new GeneralPath();
		tab.moveTo(x, y + h);
		tab.lineTo(x, y + arcLeftY);

		// CubicCurve2D.Float curve = new CubicCurve2D.Float();
		QuadCurve2D.Float curve = new QuadCurve2D.Float();
		curve.x1 = x;
		curve.y1 = (float) (y + arcLeftY);
		curve.x2 = (float) (x + arcLeftX);
		curve.y2 = y;
		curve.ctrlx = x;
		curve.ctrly = y;
		// curve.ctrlx1 = x;
		// curve.ctrly1 = y;
		// curve.ctrlx2 = x;
		// curve.ctrly2 = y;
		tab.append(curve, true);

		tab.lineTo(w - arcRightX, x);

		// curve = new CubicCurve2D.Float();
		curve = new QuadCurve2D.Float();
		curve.x1 = (float) (x + w - arcRightX);
		curve.y1 = y;
		curve.x2 = x + w;
		curve.y2 = (float) (y + arcRightY);
		curve.ctrlx = x + w;
		curve.ctrly = y;
		// curve.ctrlx1 = x + w;
		// curve.ctrly1 = y;
		// curve.ctrlx2 = x + w;
		// curve.ctrly2 = y;
		tab.append(curve, true);

		tab.lineTo(w + x, h + y);
		tab.closePath();

		return tab;
	}

	public static Shape getComWidgetShape(double x, double y, double w,
			double h, double arc) {
		return getComWidgetShape(x, y, w, h, arc, arc, arc, arc, arc, arc, arc,
				arc, 0);
	}

	public static Shape getComWidgetShape(double x, double y, double w,
			double h, double arcTopLeftX, double arcTopLeftY,
			double arcTopRightX, double arcTopRightY, double arcBotLeftX,
			double arcBotLeftY, double arcBotRightX, double arcBotRightY,
			double ctrlFactor) {

		double hHalf = h / 2;
		GeneralPath tab = new GeneralPath();
		tab.moveTo(x, y + hHalf);
		tab.lineTo(x, y + arcTopLeftY);

		QuadCurve2D.Double curve = new QuadCurve2D.Double();
		curve.x1 = x;
		curve.y1 = y + arcTopLeftY;
		curve.x2 = x + arcTopLeftX;
		curve.y2 = y;
		curve.ctrlx = x + ctrlFactor;
		curve.ctrly = y + ctrlFactor;
		tab.append(curve, true);
		tab.lineTo(w - arcTopRightX, x);

		curve = new QuadCurve2D.Double();
		curve.x1 = x + w - arcTopRightX;
		curve.y1 = y;
		curve.x2 = x + w;
		curve.y2 = y + arcTopRightY;
		curve.ctrlx = x + w - ctrlFactor;
		curve.ctrly = y + ctrlFactor;
		tab.append(curve, true);
		tab.lineTo(w + x, h + y - arcBotRightY);

		curve = new QuadCurve2D.Double();
		curve.x1 = x + w;
		curve.y1 = y + h - arcBotRightY;
		curve.x2 = x + w - arcBotRightX;
		curve.y2 = y + h;
		curve.ctrlx = x + w - ctrlFactor;
		curve.ctrly = y + h - ctrlFactor;
		tab.append(curve, true);
		tab.lineTo(x + arcBotLeftX, h + y);

		curve = new QuadCurve2D.Double();
		curve.x1 = x + arcBotLeftX;
		curve.y1 = h + y;
		curve.x2 = x;
		curve.y2 = y + h - arcBotLeftY;
		curve.ctrlx = x + ctrlFactor;
		curve.ctrly = y + h - ctrlFactor;
		tab.append(curve, true);

		tab.closePath();

		return tab;
	}

	// shape operations
	public static Shape resizeShape(Shape s, int curW, int curH, int desW,
			int desH) {
		return scaleShape(s, curW - desW, curH - desH);
	}

	public static Shape rotateShape(Shape s, float degree) {
		AffineTransform tx = new AffineTransform();
		tx.rotate(degree * DEGREE_TO_RADIAN);
		return tx.createTransformedShape(s);
	}

	public static Shape scaleShape(Shape s, float scalex, float scaley) {
		AffineTransform tx = new AffineTransform();
		tx.scale(scalex, scaley);
		return tx.createTransformedShape(s);
	}

	public static Shape shearShape(Shape s, float shiftx, float shifty) {
		AffineTransform tx = new AffineTransform();
		tx.shear(shiftx, shifty);
		return tx.createTransformedShape(s);
	}

	public static Shape translateShape(Shape s, float x, float y) {
		AffineTransform tx = new AffineTransform();
		tx.translate(x, y);
		return tx.createTransformedShape(s);
	}

	public static Shape getRoundedRectangle2D(double x, double y, double width,
			double height, double arcX, double arcY) {
		return new RoundRectangle2D.Double(x, y, width, height, arcX, arcY);
	}
}
