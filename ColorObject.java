import java.awt.*;

public class ColorObject {
	private Color c;
	private boolean use;
	private String name;

	public ColorObject(Color cI, boolean useI, String nameI) {
		c = cI;
		use = useI;
		name = nameI;
	}

	public Color getColor() {
		return c;
	}

	public boolean getUse() {
		return use;
	}

	public String getName() {
		return name;
	}

	public static Color[] selectColors(ColorObject[] origColorObjects) {
		Color[] selectColors = new Color[origColorObjects.length];
		int counter1 = 0;

		for (int i = 0; i < origColorObjects.length; i++) {
			if (origColorObjects[i].getUse()) {
				selectColors[counter1] = origColorObjects[i].getColor();
				counter1++;
			}
		}
		Color[] selectColorsShortened = new Color[counter1];
		for (int i = 0; i < counter1; i++) {
			selectColorsShortened[i] = selectColors[i];
		}

		return selectColorsShortened;
	}

}