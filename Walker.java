import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Walker extends JPanel {
	public Walker(Color backColor) {
		setBackground(backColor);
	}

	public void paintComponent(Graphics myGraphics) {

		super.paintComponent(myGraphics);

		layer(
				myGraphics,
				/* input */ 0,
				/* color */ Color.red,
				/* special color? */ true,
				/* special color type */ "cycle",
				/* blob size */ 75000,
				/* motion type */ "random",
				/* shape */ "lines",
				/* size scale */ .7,
				/* randomizer */ 10,
				/* circle limiter? */ true,
				/* stuffOutside? */ false,
				/* circle radius */ 200,

				/* red */ false,
				/* blue */ false,
				/* cyan */ false,
				/* magenta */ false,
				/* orange */ false,
				/* pink */ false,
				/* yellow */ false,
				/* green */ false,
				/* marsala */ false,
				/* radiandOrchid */ false,
				/* emerald */ false,
				/* tangerineTango */ false,
				/* honeysucle */ false,
				/* turquoise */ false,
				/* mimosa */ false,
				/* blueIzis */ false,
				/* chiliPepper */ false,
				/* sandDollar */ false,
				/* blueTurquoise */ false,
				/* tigerlily */ false,
				/* aquaSky */ false,
				/* trueRed */ false,
				/* fuchsiaRose */ false,
				/* ceruleanBlue */ false,
				/* earthGreen */ false,
				/* earthBlue */ true

		);

		layer(
				myGraphics,
				/* input */ 5000000,
				/* color */ Color.black,
				/* special color? */ true,
				/* special color type */ "cycle",
				/* blob size */ 2000,
				/* motion type */ "90s",
				/* shape */ "lines",
				/* size scale */ 2,
				/* randomizer */ 3,
				/* circle limiter? */ true,
				/* stuffOutside? */ false,
				/* circle radius */ 1000,

				/* red */ true,
				/* blue */ true,
				/* cyan */ true,
				/* magenta */ true,
				/* orange */ true,
				/* pink */ true,
				/* yellow */ true,
				/* green */ true,
				/* marsala */ false,
				/* radiandOrchid */ false,
				/* emerald */ false,
				/* tangerineTango */ true,
				/* honeysucle */ false,
				/* turquoise */ true,
				/* mimosa */ false,
				/* blueIzis */ false,
				/* chiliPepper */ false,
				/* sandDollar */ false,
				/* blueTurquoise */ false,
				/* tigerlily */ false,
				/* aquaSky */ false,
				/* trueRed */ false,
				/* fuchsiaRose */ false,
				/* ceruleanBlue */ true,
				/* earthGreen */ false,
				/* earthBlue */ false

		);

		layer(
				myGraphics,
				/* input */ 0,
				/* color */ Color.green,
				/* special color? */ true,
				/* special color type */ "cycle",
				/* blob size */ 2000,
				/* motion type */ "random",
				/* shape */ "fillCircles",
				/* size scale */ .3,
				/* randomizer */ 7,
				/* circle limiter? */ true,
				/* stuffOutside? */ true,
				/* circle radius */ 200,

				/* red */ true,
				/* blue */ false,
				/* cyan */ false,
				/* magenta */ false,
				/* orange */ false,
				/* pink */ false,
				/* yellow */ false,
				/* green */ false,
				/* marsala */ false,
				/* radiandOrchid */ false,
				/* emerald */ false,
				/* tangerineTango */ false,
				/* honeysucle */ false,
				/* turquoise */ false,
				/* mimosa */ false,
				/* blueIzis */ false,
				/* chiliPepper */ false,
				/* sandDollar */ false,
				/* blueTurquoise */ false,
				/* tigerlily */ false,
				/* aquaSky */ false,
				/* trueRed */ false,
				/* fuchsiaRose */ false,
				/* ceruleanBlue */ false,
				/* earthGreen */ false,
				/* earthBlue */ false

		);

	}

	public void layer(
			Graphics g,
			int inpuT,
			Color coloR,
			boolean specialcoloR,
			String typE,
			int blobsizE,
			String motioN,
			String shapE,
			double sizescalE,
			int randomizeR,
			boolean circlelimiteR,
			boolean outsidE,
			int circleradiuS,

			boolean b1s,
			boolean b2s,
			boolean b3s,
			boolean b4s,
			boolean b5s,
			boolean b6s,
			boolean b7s,
			boolean b8s,
			boolean b9s,
			boolean b11s,
			boolean b10s,
			boolean b12s,
			boolean b13s,
			boolean b14s,
			boolean b15s,
			boolean b16s,
			boolean b17s,
			boolean b18s,
			boolean b19s,
			boolean b20s,
			boolean b21s,
			boolean b22s,
			boolean b23s,
			boolean b24s,
			boolean b25s,
			boolean b26s

	)

	{
		ColorObject[] colorBank = {
				new ColorObject(Color.white, b1s, "red"),
				new ColorObject(Color.blue, b2s, "blue"),
				new ColorObject(Color.cyan, b3s, "cyan"),
				new ColorObject(Color.magenta, b4s, "magenta"),
				new ColorObject(Color.orange, b5s, "orange"),
				new ColorObject(Color.pink, b6s, "pink"),
				new ColorObject(Color.yellow, b7s, "yellow"),
				new ColorObject(Color.green, b8s, "green"),
				new ColorObject(new Color(149, 82, 81), b9s, "marsala"),
				new ColorObject(new Color(181, 101, 167), b10s, "radiandOrchid"),
				new ColorObject(new Color(0, 155, 119), b11s, "emerald"),
				new ColorObject(new Color(221, 65, 36), b12s, "tangerineTango"),
				new ColorObject(new Color(214, 80, 118), b13s, "honeysucle"),
				new ColorObject(new Color(68, 184, 172), b14s, "turquoise"),
				new ColorObject(new Color(239, 192, 80), b15s, "mimosa"),
				new ColorObject(new Color(91, 94, 166), b16s, "blueIzis"),
				new ColorObject(new Color(155, 35, 53), b17s, "chiliPepper"),
				new ColorObject(new Color(223, 207, 190), b18s, "sandDollar"),
				new ColorObject(new Color(85, 180, 176), b19s, "blueTurquoise"),
				new ColorObject(new Color(225, 93, 68), b20s, "tigerlily"),
				new ColorObject(new Color(127, 205, 205), b21s, "aquaSky"),
				new ColorObject(new Color(188, 36, 60), b22s, "trueRed"),
				new ColorObject(new Color(195, 68, 122), b23s, "fuchsiaRose"),
				new ColorObject(new Color(152, 180, 212), b24s, "ceruleanBlue"),
				new ColorObject(new Color(11, 138, 0), b25s, "earthGreen"),
				new ColorObject(new Color(0, 21, 170), b26s, "earthBlue")
		};

		Color[] cA = ColorObject.selectColors(colorBank);

		Random gen = new Random();
		int xI = getWidth() / 2, xF = getWidth() / 2;
		int yI = getHeight() / 2, yF = getHeight() / 2;

		int input = inpuT;

		Color c = coloR;
		boolean specialColor = specialcoloR;
		String type = typE; // bAndW, random, cycle
		int blobSize = blobsizE;

		String motion = motioN;

		String shape = shapE; // lines, fillCircles, openCircles, fillSquares, openSquares, 90s
		double sizeScale = sizescalE;
		int randomizer = randomizeR; // usually 10

		boolean circleLimiter = circlelimiteR;
		boolean outside = outsidE;
		int circleRadius = circleradiuS;

		for (int z = 0; z < input; z++) {

			xI = xF;
			yI = yF;

			if (specialColor) {
				if (type.equals("bAndW")) {
					int i = gen.nextInt(256);
					c = new Color(i, i, i);
				}
				if (type.equals("random")) {
					c = new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
				}
				if (type.equals("cycle")) {
					int cycleTracker = (z / blobSize % cA.length);
					c = cA[cycleTracker];

				}
			}

			g.setColor(c);

			if (motion.equals("random")) {
				xF = xI + gen.nextInt(randomizer * 2 + 1) - randomizer;
				yF = yI + gen.nextInt(randomizer * 2 + 1) - randomizer;
			}

			if (motion.equals("90s")) {
				if (z % 2 == 0) {
					xF = xI + gen.nextInt(randomizer * 2 + 1) - randomizer;
				} else {
					yF = yI + gen.nextInt(randomizer * 2 + 1) - randomizer;
				}
			}

			if (xF > getWidth()) {
				xF = xF - getWidth();
				continue;
			}
			if (xF < 0) {
				xF = xF + getWidth();
				continue;
			}
			if (yF > getHeight()) {
				yF = yF - getHeight();
				continue;
			}
			if (yF < 0) {
				yF = yF + getHeight();
				continue;
			}

			if (circleLimiter) {
				if (outside) {
					if (Math.sqrt((xF - getWidth() / 2) * (xF - getWidth() / 2)
							+ (yF - getHeight() / 2) * (yF - getHeight() / 2)) < circleRadius) {
						continue;
					}
				} else {
					if (Math.sqrt((xF - getWidth() / 2) * (xF - getWidth() / 2)
							+ (yF - getHeight() / 2) * (yF - getHeight() / 2)) > circleRadius) {
						continue;
					}
				}
			}

			if (shape.equals("lines")) {
				g.drawLine(xI, yI, xF, yF);
			}
			if (shape.equals("openCircles")) {
				int r = (int) ((xF - xI) * sizeScale);
				g.drawOval(xI, yI, r, r);
			}
			if (shape.equals("fillCircles")) {
				int r = (int) ((xF - xI) * sizeScale);
				g.fillOval(xI, yI, r, r);
			}
			if (shape.equals("openSquares")) {
				int r = (int) ((xF - xI) * sizeScale);
				g.drawRect(xI, yI, r, r);
			}
			if (shape.equals("fillSquares")) {
				int r = (int) ((xF - xI) * sizeScale);
				g.fillRect(xI, yI, r, r);
			}
		}
	}
}
